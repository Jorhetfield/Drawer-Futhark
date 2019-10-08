package es.vanadis.testingrunes.setup


import android.content.Context
import com.google.gson.Gson
import es.vanadis.drawertests.R
import es.vanadis.testingrunes.features.runes.model.Symbol

class VanadisRepository(private val service: VanadisService, private val context: Context) {


    suspend fun getRunes() {
        val json = context.getJsonFromResource(R.raw.products)
        val response: List<Symbol> = Gson().fromJson(json, Array<Symbol>::class.java).toList()
        ResponseResult.Success(response)
    }
//    suspend fun getProducts(
//        Type: Int,
//        Lang: String,
//        Country: Int,
//        fake: Boolean = BuildConfig.MOCK
//    ): ResponseResult<List<Product>> {
//        return if (!fake) {
//            try {
//                val response = service.getProducts(Type, Lang, Country)
//                checkResponse(context, response)
//            } catch (e: Exception) {
//                checkException(context, e)
//            }
//        } else {
//            val json = context.getJsonFromResource(R.raw.products)
//            val response: List<Product> = Gson().fromJson(json, Array<Product>::class.java).toList()
//            ResponseResult.Success(response)
//        }
//    }

//    suspend fun doLogin(email: String, password: String, fake: Boolean = BuildConfig.MOCK): ResponseResult<User> {
//        return if (!fake) {
//            try {
//                val response = service.login(email, password)
//                checkResponse(context, response)
//            } catch (e: Exception) {
//                checkException(context, e)
//            }
//        } else {
//            context.getMockResponseResult(R.raw.symbols)
//        }
//    }
//
//    suspend fun doRegister(
//        email: String,
//        password: String,
//        passwordRepeat: String,
//        name: String,
//        surname: String,
//        country: Int,
//        type: Int,
//        newsletter: Int,
//        fake: Boolean = BuildConfig.MOCK
//    ): ResponseResult<User> {
//        return if (!fake) {
//            try {
//                val response =
//                    service.register(email, password, passwordRepeat, name, surname, country, type, newsletter)
//                checkResponse(context, response)
//            } catch (e: Exception) {
//                checkException(context, e)
//            }
//        } else {
//            context.getMockResponseResult(R.raw.symbols)
//        }
//    }
//
//    suspend fun updateUser(
//        name: String,
//        email: String,
//        surname: String,
//        country: Int,
//        type: Int,
//        newsletter: Int,
//        fake: Boolean = BuildConfig.MOCK
//    ): ResponseResult<User> {
//        return if (!fake) {
//            try {
//                val response = service.updateUser(name, email, surname, type, country, newsletter)
//                checkResponse(context, response)
//            } catch (e: Exception) {
//                checkException(context, e)
//            }
//        } else {
//            context.getMockResponseResult(R.raw.symbols)
//        }
//    }
//
//    suspend fun changePassword(
//        oldPassword: String,
//        resetPassword: String,
//        resetPasswordRepeat: String,
//        fake: Boolean = BuildConfig.MOCK
//    ): ResponseResult<User> {
//        return if (!fake) {
//            try {
//                val response = service.changePassword(oldPassword, resetPassword, resetPasswordRepeat)
//                checkResponse(context, response)
//            } catch (e: Exception) {
//                checkException(context, e)
//            }
//        } else {
//            context.getMockResponseResult(R.raw.symbols)
//        }
//    }
//
//
//    suspend fun getProducts(
//        Type: Int,
//        Lang: String,
//        Country: Int,
//        fake: Boolean = BuildConfig.MOCK
//    ): ResponseResult<List<Product>> {
//        return if (!fake) {
//            try {
//                val response = service.getProducts(Type, Lang, Country)
//                checkResponse(context, response)
//            } catch (e: Exception) {
//                checkException(context, e)
//            }
//        } else {
//            val json = context.getJsonFromResource(R.raw.products)
//            val response: List<Product> = Gson().fromJson(json, Array<Product>::class.java).toList()
//            ResponseResult.Success(response)
//        }
//    }
//
//    suspend fun getCompetitiveProducts(
//        id: Int,
//        lang: String,
//        country: Int,
//        fake: Boolean = BuildConfig.MOCK
//    ): ResponseResult<List<CompetitiveProducts>> {
//        return if (!fake) {
//            try {
//                val response = service.getCompetitiveProducts(id, lang, country)
//                checkResponse(context, response)
//            } catch (e: Exception) {
//                checkException(context, e)
//            }
//        } else {
//            val json = context.getJsonFromResource(R.raw.equivalents)
//            val response: List<CompetitiveProducts> =
//                Gson().fromJson(json, Array<CompetitiveProducts>::class.java).toList()
//            ResponseResult.Success(response)
//        }
//    }
//
//
//
//    suspend fun getFilters(
//        Type: Int,
//        Lang: String,
//        Country: Int, fake: Boolean = BuildConfig.MOCK
//    ): ResponseResult<List<Filter>> {
//        return (if (!fake) {
//            try {
//                val response = service.getFilters(Type, Lang, Country)
//                checkResponse(context, response)
//            } catch (e: Exception) {
//                checkException(context, e)
//            }
//        } else {
//            val json = context.getJsonFromResource(R.raw.filters)
//            val response: List<Filter> = Gson().fromJson(json, Array<Filter>::class.java).toList()
//            ResponseResult.Success(response)
//        })
//    }
//
//
//    suspend fun getBrands(
//        Type: Int,
//        Lang: String,
//        Country: Int,
//        fake: Boolean = BuildConfig.MOCK
//    ): ResponseResult<List<Brand>> {
//        return if (!fake) {
//            try {
//                val response = service.getBrands(Type, Lang, Country)
//                checkResponse(context, response)
//            } catch (e: Exception) {
//                checkException(context, e)
//            }
//        } else {
//            val json = context.getJsonFromResource(R.raw.brands)
//            val response: List<Brand> = Gson().fromJson(json, Array<Brand>::class.java).toList()
//            ResponseResult.Success(response)
//        }
//    }
//
//    suspend fun getCompetitiveBrands(
//        id: Int,
//        lang: String,
//        country: Int,
//        fake: Boolean = BuildConfig.MOCK
//    ): ResponseResult<List<Brand>> {
//        return if (!fake) {
//            try {
//                val response = service.getCompetitiveBrands(id, lang, country)
//                checkResponse(context, response)
//            } catch (e: Exception) {
//                checkException(context, e)
//            }
//        } else {
//            val json = context.getJsonFromResource(R.raw.brands)
//            val response: List<Brand> = Gson().fromJson(json, Array<Brand>::class.java).toList()
//            ResponseResult.Success(response)
//        }
//    }
//
//    suspend fun recoverPassword(
//        email: String,
//        fake: Boolean = BuildConfig.MOCK
//    ): ResponseResult<Operation> {
//        return if (!fake) {
//            try {
//                val response = service.recoverPassword(email)
//                checkResponse(context, response)
//            } catch (e: Exception) {
//                checkException(context, e)
//            }
//        } else {
//            context.getMockResponseResult(R.raw.operation)
//        }
//    }
}


