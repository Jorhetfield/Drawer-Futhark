package es.vanadis.testingrunes.setup


import es.vanadis.testingrunes.features.runes.model.Symbol
import retrofit2.Response
import retrofit2.http.*

interface VanadisService {
//    @FormUrlEncoded
//    @POST("/api/login/login")
//    suspend fun login(
//        @Field("email") email: String,
//        @Field("password") password: String
//    ): Response<User>
//
//    @FormUrlEncoded
//    @POST("/api/login/register")
//    suspend fun register(
//        @Field("email") email: String,
//        @Field("password") password: String,
//        @Field("password_repeat") passwordRepeat: String,
//        @Field("name") name: String,
//        @Field("surname") surname: String,
//        @Field("country") country: Int,
//        @Field("type") type: Int,
//        @Field("newsletter") newsletter: Int
//    ): Response<User>
//
//    @FormUrlEncoded
//    @POST("/api/symbols/update_user")
//    suspend fun updateUser(
//        @Field("name") name: String,
//        @Field("email") email: String,
//        @Field("surname") surname: String,
//        @Field("country") country: Int,
//        @Field("type") type: Int,
//        @Field("newsletter") newsletter: Int
//    ): Response<User>
//
//
//    @FormUrlEncoded
//    @POST("/api/symbols/change_password")
//    suspend fun changePassword(
//        @Field("old_password") oldPassword: String,
//        @Field("reset_password") resetPassword: String,
//        @Field("reset_password_repeat") resetPasswordRepeat: String
//    ): Response<User>
//
//    @FormUrlEncoded
//    @POST("/api/login/remember_password")
//    suspend fun recoverPassword(
//        @Field("email") email: String
//    ): Response<Operation>
//
//    @GET("/api/products/all_products")
//    suspend fun getProducts(
//        @Header("type") type: Int,
//        @Header("lang") lang: String,
//        @Header("country") country: Int
//    ): Response<List<Product>>
//
//
//    @GET("/api/brands/brands")
//    suspend fun getBrands(
//        @Header("type") type: Int,
//        @Header("lang") lang: String,
//        @Header("country") country: Int
//    ): Response<List<Brand>>
//
//    @GET("/api/filters/filters")
//    suspend fun getFilters(
//        @Header("type") type: Int,
//        @Header("lang") lang: String,
//        @Header("country") country: Int
//    ): Response<List<Filter>>
//
//    @GET("/api/products/competitive_products")
//    suspend fun getCompetitiveProducts(
//        @Header("type") elementID: Int,
//        @Header("lang") lang: String,
//        @Header("country") country: Int
//    ): Response<List<CompetitiveProducts>>

    @GET("/api/brands/competitive_brands")
    suspend fun getCompetitiveBrands(
        @Header("type") elementID: Int,
        @Header("lang") lang: String,
        @Header("country") country: Int
    ): Response<List<Symbol>>


}