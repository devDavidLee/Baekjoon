import sys
sys.setrecursionlimit(10 ** 5) 

def dfs(graph, start, visited, depth, t):
    # visited.append(start)
    t.append(start)
    visited[start]=1
    for node in graph[start]:
        if visited[node]==0:
            #print("dfs(node:",node,")",end="\n")
            depth[node]=depth[start]+1                # 노드 깊이 +1
            dfs(graph, node, visited, depth, t)
    return depth,visited

N, M, R = map(int, input().split())

graph = dict()
for i in range(1,N+1):
    graph[i]=[]


visited = [0 for _ in range(N+1)]
depth = [-1 for _ in range(N+1)]
t=[]

for i in range(1,M+1):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


# graph[1] = [2,4]
# graph[2] = [1,3,4]
# graph[3] = [2,4]
# graph[4] = [1,2,3]
# graph[5] = []


for i in range(1,N+1):
    graph[i].sort()

result=dfs(graph,R,visited, depth, t)
sum=0

for i in range(1,N+1):
    if result[1][i]==1:
        result[0][i]=result[0][i]+1


for i in range(1,N+1):
    if result[1][i]==1:
        a=result[0][i]
        b=t[i-1]
        sum=sum+(a*b)

print(sum)

# print(graph)
# print(dfs(graph,1))