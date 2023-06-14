# DFS 메서드 정의
def dfs (graph, node, visited):
    visited[node] = True
    print(node)
    for i in graph[node]:
        #print("i=================",i)
        if not visited[i]:
            dfs(graph, i, visited)

N, M, R = map(int, input().split())
graph_dic = {}
for i in range(N):
    a,b = map(int, input().split())
    graph_dic[a]=b
    graph_dic[b]=a

print("dic:",graph_dic)

for i in range(1,N+1):
    if not (i in graph_dic):
        print(i,": X")
    else:
        print(i,":",graph_dic[i])

# graph = [
#     [],
#     [2, 4],
#     [1, 3, 4],
#     [2, 4],
#     [1, 2, 3],
#     [],
# ]

# visited = [False] * 5

# dfs(graph, 1, visited)