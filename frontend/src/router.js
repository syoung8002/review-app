
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReviewReviewManager from "./components/listers/ReviewReviewCards"
import ReviewReviewDetail from "./components/listers/ReviewReviewDetail"

import ReviewsView from "./components/ReviewsView"
import ReviewsViewDetail from "./components/ReviewsViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reviews/reviews',
                name: 'ReviewReviewManager',
                component: ReviewReviewManager
            },
            {
                path: '/reviews/reviews/:id',
                name: 'ReviewReviewDetail',
                component: ReviewReviewDetail
            },

            {
                path: '/reviews/reviews',
                name: 'ReviewsView',
                component: ReviewsView
            },
            {
                path: '/reviews/reviews/:id',
                name: 'ReviewsViewDetail',
                component: ReviewsViewDetail
            },


    ]
})
