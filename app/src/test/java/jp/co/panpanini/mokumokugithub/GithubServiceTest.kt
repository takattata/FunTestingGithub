//package jp.co.panpanini.mokumokugithub
//
//import com.nhaarman.mockito_kotlin.*
//import io.reactivex.Completable
//import io.reactivex.Flowable
//import io.reactivex.Maybe
//import jp.co.panpanini.mokumokugithub.api.GithubApi
//import jp.co.panpanini.mokumokugithub.model.Repo
//import jp.co.panpanini.mokumokugithub.model.User
//import org.junit.Before
//import org.junit.Test
//
//import org.junit.Assert.*
//
//@Suppress("RemoveRedundantBackticks")
//class GithubServiceTest {
//
//    lateinit var target: GithubService
//
//    private var githubApi: GithubApi = mock { }
//    private var githubRepository: GithubRepository = mock { }
//
//    private val user: User = mock { }
//
//    @Before
//    fun setUp() {
//        target = GithubService(githubApi, githubRepository)
//    }
//
//    @Test
//    fun `fetchUser should pass usernmae as a parameter`() {
//        val expected = "username"
//
//        whenever(githubApi.user(any())).thenReturn(Maybe.empty())
//
//        target.fetchUser(expected)
//            .test()
//            .assertNoErrors()
//            .assertComplete()
//
//        verify(githubApi, times(1)).user(expected)
//    }
//
//    @Test
//    fun `observeUser should return user from githubRepository`() {
//        whenever(githubRepository.observeUser()).thenReturn(
//            Flowable.just(user)
//        )
//
//        target.observeUser()
//            .test()
//            .assertNoErrors()
//            .assertValue(user)
//
//    }
//
//}