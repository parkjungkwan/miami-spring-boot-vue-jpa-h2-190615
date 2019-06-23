import Vue from 'vue'
import Router from 'vue-router'


Vue.use(Router)
const Home = { template: '<div>Home</div>'}
const NotFound = { template: '<div>Not Found</div>'}

const router = new Router({
  mode: 'history', // # 제거
  routes: [
    { path: '/', Home},
    { path: '/hello', component: '<div>hello</div>' },
    { path: '/login', component: '<div>login</div>'},
    { path: '/logout',component: '<div>logout</div>'},
    { path: '/posts',
      component: { template: '<div>Posts <br/><router-view></router-view></div>' },

      // 중첩된 라우트는 children 속성으로 하위 라우트를 정의할 수 있다.
      children: [
        { path: 'new', component: { template: '<div>New Post</div>' } },
        { path: ':id', 
          component: {
          // this.$route.params.id로 id 값에 접근할 수 있다
            template: '<div>PostView<br />id:{{this.$route.params.id}}</div>'
        } } // 동적 라우트 매칭
      ]
    },
    { path: '*', component: NotFound}
  ]
})

export default router

/*
import HelloWorld from '@/components/HelloWorld'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    }
  ]
})
*/
