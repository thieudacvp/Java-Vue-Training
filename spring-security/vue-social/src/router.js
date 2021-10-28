import Login from './components/Login.vue'
import Profile from './components/Profile.vue'
import Confirm from './components/Confirm.vue'
import VueRouter from 'vue-router';

const routes = [
    {
        path: '/',
        name:'login',
        component: Login,
    },
    {
        path: '/profile',
        name: 'profile',
        component: Profile,
    },
    {
        path: '/oauth2/redirect',
        name: 'confirm',
        component: Confirm
    }
    
];
const router = new VueRouter({
    mode: "history",
    routes
})

router.beforeEach((to, from, next) => {
    if(to.path == '/'){
        next();
    }else{
        next();
    }
})

export default router
