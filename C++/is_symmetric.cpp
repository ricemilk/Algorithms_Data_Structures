#include<iostream>

using namespace std;

struct Node{
    int val;
    Node *left, *right;
    Node(int v, Node *l = NULL, Node *r = NULL):val(v),left(l), right(r){}
};

bool is_symmetric(Node *root1, Node *root2){
    if(!root1 && !root2) return true;
    if(!root1 || !root2) return false;
    if(root1->val != root2->val) return false;
    return is_symmetric(root1->left, root2->left) && is_symmetric(root1->right, root2->right);
}

int insert(Node *&root, int a){
    if(root == NULL){
        root = new Node(a);
    } else if (a < root->val){
        insert(root->left, a);
    } else if (a > root->val){
        insert(root->right, a);
    }
    return 0;
}
int a[] ={2, 3, 3, 5, 6, 5, 6};
Node* nodes[7];
int main(){
    Node *p = NULL;
    for(int i = 0; i < 7; i++){
        nodes[i] = new Node(a[i]);
    }
    nodes[0]->left = nodes[1];
    nodes[0]->right = nodes[2];
    //    nodes[1]->left = nodes[3];
    nodes[1]->right = nodes[4];
    //    nodes[2]->left = nodes[5];
    nodes[2]->right = nodes[6];
    p = nodes[0];
    cout << is_symmetric(p->left, p->right) << endl;
    return 0;
}