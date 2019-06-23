<template>
  <div id="app">
    <div>
    <!-- 라우터 링크를 추가 -->
    <router-link to="/">Home</router-link>
    <!-- <router-link to="/hello">Hello</router-link> -->
    <router-link to="/logout">Logout</router-link>
    <router-link to="/login" exact>Login</router-link>
    <router-link to="/posts">Posts</router-link>
    <router-link to="/posts/new" exact>New Post</router-link>
    <router-link to="/posts/detail" exact>New Post</router-link>
  </div>
    <router-view/>
  </div>
</template>
// 히스토리모드와 해쉬뱅 모드에서는 주소 체계가 달라서 <a> 태그를 사용할 경우
//  모드 변경시 주소값을 일일이 변경해 줘야한다. 하지만 <router-link>는 변경할 필요가 없다.
// <a> 태그를 클릭하면 화면을 갱신하는데 <router-link>는 이를 차단해준다. 
// 갱신 없이 화면을 이동할 수 있다.
<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
.router-link-active {
  color: white;
  background-color: red;
}

.router-link-exact-active {
  color: white;
  background-color: blue;
}
</style>
