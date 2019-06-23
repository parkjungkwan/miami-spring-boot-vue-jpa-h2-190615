import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Main from '@/components/Main'
import Manager from '@/components/Manager'
import State from '@/components/State'
import Resister from '@/components/Resister'
import Option from '@/components/Option'

Vue.use(Router)

export default new Router({
  routes: [
    {path: '/', name: 'Home', component: Home},
    {path: '/main',name: 'Main',component: Main},
    {path: '/manager',name: 'Manager',component: Manager},
    {path: '/state',name: 'State',component: State},
    {path: '/resister',name: 'resister', component: Resister},
    {path: '/option',name: 'option',component: Option}
  ]
})
