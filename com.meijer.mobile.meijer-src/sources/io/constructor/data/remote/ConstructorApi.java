package io.constructor.data.remote;

import io.constructor.data.model.autocomplete.AutocompleteResponse;
import io.constructor.data.model.browse.BrowseFacetOptionsResponse;
import io.constructor.data.model.browse.BrowseFacetsResponse;
import io.constructor.data.model.browse.BrowseGroupsResponse;
import io.constructor.data.model.browse.BrowseResponse;
import io.constructor.data.model.browse.BrowseResultClickRequestBody;
import io.constructor.data.model.browse.BrowseResultLoadRequestBody;
import io.constructor.data.model.conversion.ConversionRequestBody;
import io.constructor.data.model.purchase.PurchaseRequestBody;
import io.constructor.data.model.quiz.QuizConversionRequestBody;
import io.constructor.data.model.quiz.QuizQuestionResponse;
import io.constructor.data.model.quiz.QuizResultClickRequestBody;
import io.constructor.data.model.quiz.QuizResultLoadRequestBody;
import io.constructor.data.model.quiz.QuizResultsResponse;
import io.constructor.data.model.recommendations.RecommendationResultClickRequestBody;
import io.constructor.data.model.recommendations.RecommendationResultViewRequestBody;
import io.constructor.data.model.recommendations.RecommendationsResponse;
import io.constructor.data.model.search.SearchResponse;
import io.constructor.data.model.tracking.GenericResultClickRequestBody;
import io.constructor.data.model.tracking.ItemDetailLoadRequestBody;
import io.reactivex.b;
import io.reactivex.u;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.adapter.rxjava2.Result;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJE\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\f\u001a\u00020\u00022\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\f\u001a\u00020\u00022\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u0013\u0010\u0012J%\u0010\u0015\u001a\u00020\u00102\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\u00102\b\b\u0001\u0010\u0018\u001a\u00020\u00172\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u0019\u0010\u001aJe\u0010\u001e\u001a\u00020\u00102\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010#\u001a\u00020\u00102\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020 2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b#\u0010$J1\u0010%\u001a\u00020\u00102\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020\u00102\b\b\u0001\u0010(\u001a\u00020'2\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010+\u001a\u00020\u0002H'¢\u0006\u0004\b,\u0010\bJ\u001d\u0010.\u001a\u00020-2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b.\u0010\u000bJ%\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010/\u001a\u00020\u0002H'¢\u0006\u0004\b0\u0010\bJ\u001d\u00102\u001a\u0002012\b\b\u0001\u0010/\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b2\u0010\u000bJ%\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u00103\u001a\u00020\u0002H'¢\u0006\u0004\b4\u0010\bJ\u001d\u00106\u001a\u0002052\b\b\u0001\u00103\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b6\u0010\u000bJ%\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u00107\u001a\u00020\u0002H'¢\u0006\u0004\b8\u0010\bJ\u001d\u0010:\u001a\u0002092\b\b\u0001\u00107\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b:\u0010\u000bJ%\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010;\u001a\u00020\u0002H'¢\u0006\u0004\b<\u0010\bJ\u001d\u0010>\u001a\u00020=2\b\b\u0001\u0010;\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJG\u0010A\u001a\u00020\u00102\b\b\u0001\u0010@\u001a\u00020?2\u0016\b\u0001\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r2\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\bA\u0010BJ/\u0010E\u001a\u00020\u00102\b\b\u0001\u0010D\u001a\u00020C2\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\bE\u0010FJ/\u0010I\u001a\u00020\u00102\b\b\u0001\u0010H\u001a\u00020G2\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\bI\u0010JJ/\u0010M\u001a\u00020\u00102\b\b\u0001\u0010L\u001a\u00020K2\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\bM\u0010NJ%\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010O\u001a\u00020\u0002H'¢\u0006\u0004\bP\u0010\bJ\u001d\u0010R\u001a\u00020Q2\b\b\u0001\u0010O\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\bR\u0010\u000bJ1\u0010U\u001a\u00020\u00102\b\b\u0001\u0010T\u001a\u00020S2\u0016\b\u0001\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\rH'¢\u0006\u0004\bU\u0010VJ/\u0010Y\u001a\u00020\u00102\b\b\u0001\u0010X\u001a\u00020W2\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\bY\u0010ZJ1\u0010]\u001a\u00020\u00102\b\b\u0001\u0010\\\u001a\u00020[2\u0016\b\u0001\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\rH'¢\u0006\u0004\b]\u0010^J/\u0010a\u001a\u00020\u00102\b\b\u0001\u0010`\u001a\u00020_2\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\ba\u0010bJ/\u0010e\u001a\u00020\u00102\b\b\u0001\u0010d\u001a\u00020c2\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\be\u0010fJ%\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010g\u001a\u00020\u0002H'¢\u0006\u0004\bh\u0010\bJ\u001d\u0010j\u001a\u00020i2\b\b\u0001\u0010g\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\bj\u0010\u000bJ%\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010g\u001a\u00020\u0002H'¢\u0006\u0004\bk\u0010\bJ\u001d\u0010m\u001a\u00020l2\b\b\u0001\u0010g\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\bm\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006n"}, d2 = {"Lio/constructor/data/remote/ConstructorApi;", "", "", "autocompleteUrl", "Lio/reactivex/u;", "Lretrofit2/adapter/rxjava2/Result;", "Lokhttp3/ResponseBody;", "getAutocompleteResults", "(Ljava/lang/String;)Lio/reactivex/u;", "Lio/constructor/data/model/autocomplete/AutocompleteResponse;", "getAutocompleteResultsCRT", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "term", "", "data", "encodedData", "Lio/reactivex/b;", "trackAutocompleteSelect", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/b;", "trackSearchSubmit", "params", "trackSessionStart", "(Ljava/util/Map;)Lio/reactivex/b;", "Lio/constructor/data/model/conversion/ConversionRequestBody;", "conversionRequestBody", "trackConversion", "(Lio/constructor/data/model/conversion/ConversionRequestBody;Ljava/util/Map;)Lio/reactivex/b;", "itemName", "customerId", "variationId", "trackSearchResultClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/b;", "", "resultCount", "customerIds", "trackSearchResultsLoaded", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "trackInputFocus", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "Lio/constructor/data/model/purchase/PurchaseRequestBody;", "purchaseRequestBody", "trackPurchase", "(Lio/constructor/data/model/purchase/PurchaseRequestBody;Ljava/util/Map;)Lio/reactivex/b;", "searchUrl", "getSearchResults", "Lio/constructor/data/model/search/SearchResponse;", "getSearchResultsCRT", "browseUrl", "getBrowseResults", "Lio/constructor/data/model/browse/BrowseResponse;", "getBrowseResultsCRT", "browseFacetsUrl", "getBrowseFacetsResults", "Lio/constructor/data/model/browse/BrowseFacetsResponse;", "getBrowseFacetsResultsCRT", "browseFacetOptionsUrl", "getBrowseFacetOptionsResults", "Lio/constructor/data/model/browse/BrowseFacetOptionsResponse;", "getBrowseFacetOptionsResultsCRT", "browseGroupsUrl", "getBrowseGroupsResults", "Lio/constructor/data/model/browse/BrowseGroupsResponse;", "getBrowseGroupsResultsCRT", "Lio/constructor/data/model/browse/BrowseResultClickRequestBody;", "browseResultClickRequestBody", "trackBrowseResultClick", "(Lio/constructor/data/model/browse/BrowseResultClickRequestBody;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/b;", "Lio/constructor/data/model/browse/BrowseResultLoadRequestBody;", "browseRequestBody", "trackBrowseResultsLoaded", "(Lio/constructor/data/model/browse/BrowseResultLoadRequestBody;Ljava/util/Map;)Lio/reactivex/b;", "Lio/constructor/data/model/tracking/ItemDetailLoadRequestBody;", "itemDetailLoadRequestBody", "trackItemDetailLoaded", "(Lio/constructor/data/model/tracking/ItemDetailLoadRequestBody;Ljava/util/Map;)Lio/reactivex/b;", "Lio/constructor/data/model/tracking/GenericResultClickRequestBody;", "resultClickRequestBody", "trackGenericResultClick", "(Lio/constructor/data/model/tracking/GenericResultClickRequestBody;Ljava/util/Map;)Lio/reactivex/b;", "recommendationUrl", "getRecommendationResults", "Lio/constructor/data/model/recommendations/RecommendationsResponse;", "getRecommendationResultsCRT", "Lio/constructor/data/model/recommendations/RecommendationResultClickRequestBody;", "recommendationResultClickRequestBody", "trackRecommendationResultClick", "(Lio/constructor/data/model/recommendations/RecommendationResultClickRequestBody;Ljava/util/Map;)Lio/reactivex/b;", "Lio/constructor/data/model/recommendations/RecommendationResultViewRequestBody;", "recommendationResultViewRequestBody", "trackRecommendationResultsView", "(Lio/constructor/data/model/recommendations/RecommendationResultViewRequestBody;Ljava/util/Map;)Lio/reactivex/b;", "Lio/constructor/data/model/quiz/QuizResultClickRequestBody;", "quizResultClickRequestBody", "trackQuizResultClick", "(Lio/constructor/data/model/quiz/QuizResultClickRequestBody;Ljava/util/Map;)Lio/reactivex/b;", "Lio/constructor/data/model/quiz/QuizResultLoadRequestBody;", "quizResultLoadRequestBody", "trackQuizResultLoad", "(Lio/constructor/data/model/quiz/QuizResultLoadRequestBody;Ljava/util/Map;)Lio/reactivex/b;", "Lio/constructor/data/model/quiz/QuizConversionRequestBody;", "quizConversionRequestBody", "trackQuizConversion", "(Lio/constructor/data/model/quiz/QuizConversionRequestBody;Ljava/util/Map;)Lio/reactivex/b;", "quizUrl", "getQuizNextQuestion", "Lio/constructor/data/model/quiz/QuizQuestionResponse;", "getQuizNextQuestionCRT", "getQuizResults", "Lio/constructor/data/model/quiz/QuizResultsResponse;", "getQuizResultsCRT", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface ConstructorApi {
    @GET
    u<Result<ResponseBody>> getAutocompleteResults(@Url String autocompleteUrl);

    @GET
    Object getAutocompleteResultsCRT(@Url String str, Continuation<? super AutocompleteResponse> continuation);

    @GET
    u<Result<ResponseBody>> getBrowseFacetOptionsResults(@Url String browseFacetOptionsUrl);

    @GET
    Object getBrowseFacetOptionsResultsCRT(@Url String str, Continuation<? super BrowseFacetOptionsResponse> continuation);

    @GET
    u<Result<ResponseBody>> getBrowseFacetsResults(@Url String browseFacetsUrl);

    @GET
    Object getBrowseFacetsResultsCRT(@Url String str, Continuation<? super BrowseFacetsResponse> continuation);

    @GET
    u<Result<ResponseBody>> getBrowseGroupsResults(@Url String browseGroupsUrl);

    @GET
    Object getBrowseGroupsResultsCRT(@Url String str, Continuation<? super BrowseGroupsResponse> continuation);

    @GET
    u<Result<ResponseBody>> getBrowseResults(@Url String browseUrl);

    @GET
    Object getBrowseResultsCRT(@Url String str, Continuation<? super BrowseResponse> continuation);

    @GET
    u<Result<ResponseBody>> getQuizNextQuestion(@Url String quizUrl);

    @GET
    Object getQuizNextQuestionCRT(@Url String str, Continuation<? super QuizQuestionResponse> continuation);

    @GET
    u<Result<ResponseBody>> getQuizResults(@Url String quizUrl);

    @GET
    Object getQuizResultsCRT(@Url String str, Continuation<? super QuizResultsResponse> continuation);

    @GET
    u<Result<ResponseBody>> getRecommendationResults(@Url String recommendationUrl);

    @GET
    Object getRecommendationResultsCRT(@Url String str, Continuation<? super RecommendationsResponse> continuation);

    @GET
    u<Result<ResponseBody>> getSearchResults(@Url String searchUrl);

    @GET
    Object getSearchResultsCRT(@Url String str, Continuation<? super SearchResponse> continuation);

    @GET(ApiPaths.URL_AUTOCOMPLETE_SELECT_EVENT)
    b trackAutocompleteSelect(@Path("term") String term, @QueryMap Map<String, String> data, @QueryMap(encoded = true) Map<String, String> encodedData);

    @POST(ApiPaths.URL_BROWSE_RESULT_CLICK_EVENT)
    b trackBrowseResultClick(@Body BrowseResultClickRequestBody browseResultClickRequestBody, @QueryMap Map<String, String> params, @QueryMap(encoded = true) Map<String, String> encodedData);

    @POST(ApiPaths.URL_BROWSE_RESULT_LOAD_EVENT)
    b trackBrowseResultsLoaded(@Body BrowseResultLoadRequestBody browseRequestBody, @QueryMap Map<String, String> params);

    @POST(ApiPaths.URL_CONVERSION_EVENT)
    b trackConversion(@Body ConversionRequestBody conversionRequestBody, @QueryMap Map<String, String> params);

    @POST(ApiPaths.URL_RESULT_CLICK_EVENT)
    b trackGenericResultClick(@Body GenericResultClickRequestBody resultClickRequestBody, @QueryMap Map<String, String> params);

    @GET("behavior")
    b trackInputFocus(@Query("term") String term, @QueryMap Map<String, String> params);

    @POST(ApiPaths.URL_ITEM_DETAIL_LOAD_EVENT)
    b trackItemDetailLoaded(@Body ItemDetailLoadRequestBody itemDetailLoadRequestBody, @QueryMap Map<String, String> params);

    @POST(ApiPaths.URL_PURCHASE)
    b trackPurchase(@Body PurchaseRequestBody purchaseRequestBody, @QueryMap Map<String, String> params);

    @POST(ApiPaths.URL_QUIZ_CONVERSION_EVENT)
    b trackQuizConversion(@Body QuizConversionRequestBody quizConversionRequestBody, @QueryMap Map<String, String> params);

    @POST(ApiPaths.URL_QUIZ_RESULT_CLICK_EVENT)
    b trackQuizResultClick(@Body QuizResultClickRequestBody quizResultClickRequestBody, @QueryMap Map<String, String> params);

    @POST(ApiPaths.URL_QUIZ_RESULT_LOAD_EVENT)
    b trackQuizResultLoad(@Body QuizResultLoadRequestBody quizResultLoadRequestBody, @QueryMap Map<String, String> params);

    @POST(ApiPaths.URL_RECOMMENDATION_RESULT_CLICK_EVENT)
    b trackRecommendationResultClick(@Body RecommendationResultClickRequestBody recommendationResultClickRequestBody, @QueryMap Map<String, String> params);

    @POST(ApiPaths.URL_RECOMMENDATION_RESULT_VIEW_EVENT)
    b trackRecommendationResultsView(@Body RecommendationResultViewRequestBody recommendationResultViewRequestBody, @QueryMap Map<String, String> params);

    @GET(ApiPaths.URL_SEARCH_RESULT_CLICK_EVENT)
    b trackSearchResultClick(@Path("term") String term, @Query("name") String itemName, @Query("customer_id") String customerId, @Query("variation_id") String variationId, @QueryMap Map<String, String> params, @QueryMap(encoded = true) Map<String, String> encodedData);

    @GET("behavior")
    b trackSearchResultsLoaded(@Query("term") String term, @Query("num_results") int resultCount, @Query("customer_ids") String customerIds, @QueryMap Map<String, String> params);

    @GET(ApiPaths.URL_SEARCH_SUBMIT_EVENT)
    b trackSearchSubmit(@Path("term") String term, @QueryMap Map<String, String> data, @QueryMap(encoded = true) Map<String, String> encodedData);

    @GET("behavior")
    b trackSessionStart(@QueryMap Map<String, String> params);
}
