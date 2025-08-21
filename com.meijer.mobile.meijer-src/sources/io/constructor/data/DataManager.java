package io.constructor.data;

import Lu.o;
import com.medallia.digital.mobilesdk.q2;
import com.squareup.moshi.t;
import io.constructor.data.ConstructorData;
import io.constructor.data.local.PreferencesHelper;
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
import io.constructor.data.remote.ApiPaths;
import io.constructor.data.remote.ConstructorApi;
import io.reactivex.l;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.adapter.rxjava2.Result;

@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b\u0017\u0010\u0013J7\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015JM\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\n2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\n2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b\u001d\u0010\u001cJ'\u0010\u001e\u001a\u00020\u001a2\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b\"\u0010#Jg\u0010'\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\n2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b'\u0010(JI\u0010,\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b,\u0010-J1\u0010.\u001a\u00020\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b.\u0010/J/\u00102\u001a\u00020\u001a2\u0006\u00101\u001a\u0002002\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b2\u00103JE\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00100\u000f2\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b7\u00108J?\u00109\u001a\u0002062\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b9\u0010:J5\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00100\u000f2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b;\u0010<J/\u0010=\u001a\u0002062\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J5\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00100\u000f2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b@\u0010<J/\u0010A\u001a\u00020?2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\bA\u0010>J5\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00100\u000f2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\bC\u0010<J/\u0010D\u001a\u00020B2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\bD\u0010>J5\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0\u00100\u000f2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\bF\u0010<J/\u0010G\u001a\u00020E2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\bG\u0010>J/\u0010J\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020H2\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\bJ\u0010KJM\u0010N\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020L2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\bN\u0010OJ/\u0010R\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020P2\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\bR\u0010SJ/\u0010V\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020T2\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\bV\u0010WJ=\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0\u00100\u000f2\u0006\u0010X\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\bZ\u0010\u0013J7\u0010[\u001a\u00020Y2\u0006\u0010X\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b[\u0010\u0015J1\u0010^\u001a\u00020\u001a2\u0006\u0010]\u001a\u00020\\2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b^\u0010_J1\u0010b\u001a\u00020\u001a2\u0006\u0010a\u001a\u00020`2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\bb\u0010cJ1\u0010f\u001a\u00020\u001a2\u0006\u0010e\u001a\u00020d2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\bf\u0010gJ1\u0010j\u001a\u00020\u001a2\u0006\u0010i\u001a\u00020h2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\bj\u0010kJ1\u0010n\u001a\u00020\u001a2\u0006\u0010m\u001a\u00020l2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\bn\u0010oJE\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020s0\u00100\u000f2\u0006\u0010p\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010r\u001a\u00020q¢\u0006\u0004\bt\u0010uJ?\u0010v\u001a\u00020s2\u0006\u0010p\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010r\u001a\u00020qH\u0086@ø\u0001\u0000¢\u0006\u0004\bv\u0010wJE\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020x0\u00100\u000f2\u0006\u0010p\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010r\u001a\u00020q¢\u0006\u0004\by\u0010uJ?\u0010z\u001a\u00020x2\u0006\u0010p\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010r\u001a\u00020qH\u0086@ø\u0001\u0000¢\u0006\u0004\bz\u0010wR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010{R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010|\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006}"}, d2 = {"Lio/constructor/data/DataManager;", "", "Lio/constructor/data/remote/ConstructorApi;", "constructorApi", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lio/constructor/data/remote/ConstructorApi;Lcom/squareup/moshi/t;)V", "", "Lkotlin/Pair;", "", "encodedParams", "getAdditionalParamsQueryString", "([Lkotlin/Pair;)Ljava/lang/String;", "term", "Lio/reactivex/l;", "Lio/constructor/data/ConstructorData;", "Lio/constructor/data/model/autocomplete/AutocompleteResponse;", "getAutocompleteResults", "(Ljava/lang/String;[Lkotlin/Pair;)Lio/reactivex/l;", "getAutocompleteResultsCRT", "(Ljava/lang/String;[Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/constructor/data/model/search/SearchResponse;", "getSearchResults", "getSearchResultsCRT", "params", "Lio/reactivex/b;", "trackAutocompleteSelect", "(Ljava/lang/String;[Lkotlin/Pair;[Lkotlin/Pair;)Lio/reactivex/b;", "trackSearchSubmit", "trackSessionStart", "([Lkotlin/Pair;)Lio/reactivex/b;", "Lio/constructor/data/model/conversion/ConversionRequestBody;", "conversionRequestBody", "trackConversion", "(Lio/constructor/data/model/conversion/ConversionRequestBody;[Lkotlin/Pair;)Lio/reactivex/b;", "itemName", "customerId", "variationId", "trackSearchResultClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;[Lkotlin/Pair;)Lio/reactivex/b;", "", "resultCount", "customerIds", "trackSearchResultsLoaded", "(Ljava/lang/String;I[Ljava/lang/String;[Lkotlin/Pair;)Lio/reactivex/b;", "trackInputFocus", "(Ljava/lang/String;[Lkotlin/Pair;)Lio/reactivex/b;", "Lio/constructor/data/model/purchase/PurchaseRequestBody;", "purchaseRequestBody", "trackPurchase", "(Lio/constructor/data/model/purchase/PurchaseRequestBody;[Lkotlin/Pair;)Lio/reactivex/b;", "filterName", "filterValue", "Lio/constructor/data/model/browse/BrowseResponse;", "getBrowseResults", "(Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)Lio/reactivex/l;", "getBrowseResultsCRT", "(Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBrowseItemsResults", "([Lkotlin/Pair;)Lio/reactivex/l;", "getBrowseItemsResultsCRT", "([Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/constructor/data/model/browse/BrowseFacetsResponse;", "getBrowseFacets", "getBrowseFacetsCRT", "Lio/constructor/data/model/browse/BrowseFacetOptionsResponse;", "getBrowseFacetOptions", "getBrowseFacetOptionsCRT", "Lio/constructor/data/model/browse/BrowseGroupsResponse;", "getBrowseGroups", "getBrowseGroupsCRT", "Lio/constructor/data/model/browse/BrowseResultLoadRequestBody;", "browseResultLoadRequestBody", "trackBrowseResultsLoaded", "(Lio/constructor/data/model/browse/BrowseResultLoadRequestBody;[Lkotlin/Pair;)Lio/reactivex/b;", "Lio/constructor/data/model/browse/BrowseResultClickRequestBody;", "browseResultClickRequestBody", "trackBrowseResultClick", "(Lio/constructor/data/model/browse/BrowseResultClickRequestBody;[Lkotlin/Pair;[Lkotlin/Pair;)Lio/reactivex/b;", "Lio/constructor/data/model/tracking/GenericResultClickRequestBody;", "genericResultClickRequestBody", "trackGenericResultClick", "(Lio/constructor/data/model/tracking/GenericResultClickRequestBody;[Lkotlin/Pair;)Lio/reactivex/b;", "Lio/constructor/data/model/tracking/ItemDetailLoadRequestBody;", "itemDetailLoadRequestBody", "trackItemDetailLoaded", "(Lio/constructor/data/model/tracking/ItemDetailLoadRequestBody;[Lkotlin/Pair;)Lio/reactivex/b;", "podId", "Lio/constructor/data/model/recommendations/RecommendationsResponse;", "getRecommendationResults", "getRecommendationResultsCRT", "Lio/constructor/data/model/recommendations/RecommendationResultClickRequestBody;", "recommendationResultClickRequestBody", "trackRecommendationResultClick", "(Lio/constructor/data/model/recommendations/RecommendationResultClickRequestBody;[Lkotlin/Pair;)Lio/reactivex/b;", "Lio/constructor/data/model/recommendations/RecommendationResultViewRequestBody;", "recommendationResultViewRequestBody", "trackRecommendationResultsView", "(Lio/constructor/data/model/recommendations/RecommendationResultViewRequestBody;[Lkotlin/Pair;)Lio/reactivex/b;", "Lio/constructor/data/model/quiz/QuizResultClickRequestBody;", "quizResultClickRequestBody", "trackQuizResultClick", "(Lio/constructor/data/model/quiz/QuizResultClickRequestBody;[Lkotlin/Pair;)Lio/reactivex/b;", "Lio/constructor/data/model/quiz/QuizResultLoadRequestBody;", "quizResultLoadRequestBody", "trackQuizResultLoad", "(Lio/constructor/data/model/quiz/QuizResultLoadRequestBody;[Lkotlin/Pair;)Lio/reactivex/b;", "Lio/constructor/data/model/quiz/QuizConversionRequestBody;", "quizConversionRequestBody", "trackQuizConversion", "(Lio/constructor/data/model/quiz/QuizConversionRequestBody;[Lkotlin/Pair;)Lio/reactivex/b;", "quizId", "Lio/constructor/data/local/PreferencesHelper;", "preferencesHelper", "Lio/constructor/data/model/quiz/QuizQuestionResponse;", "getQuizNextQuestion", "(Ljava/lang/String;[Lkotlin/Pair;Lio/constructor/data/local/PreferencesHelper;)Lio/reactivex/l;", "getQuizNextQuestionCRT", "(Ljava/lang/String;[Lkotlin/Pair;Lio/constructor/data/local/PreferencesHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/constructor/data/model/quiz/QuizResultsResponse;", "getQuizResults", "getQuizResultsCRT", "Lio/constructor/data/remote/ConstructorApi;", "Lcom/squareup/moshi/t;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class DataManager {
    private final ConstructorApi constructorApi;
    private final t moshi;

    private final String getAdditionalParamsQueryString(Pair<String, String>[] encodedParams) {
        int length = encodedParams.length;
        String str = "";
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Pair<String, String> pair = encodedParams[i10];
            i10++;
            int i12 = i11 + 1;
            String str2 = i11 != 0 ? "&" : "?";
            str = ((Object) str) + str2 + ((Object) pair.c()) + "=" + ((Object) pair.d());
            i11 = i12;
        }
        return str;
    }

    public final Object getAutocompleteResultsCRT(String str, Pair<String, String>[] pairArr, Continuation<? super AutocompleteResponse> continuation) {
        String str2 = String.format(ApiPaths.URL_AUTOCOMPLETE, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.i(str2, "format(this, *args)");
        return this.constructorApi.getAutocompleteResultsCRT(q2.f93563c + str2 + getAdditionalParamsQueryString(pairArr), continuation);
    }

    public final Object getBrowseResultsCRT(String str, String str2, Pair<String, String>[] pairArr, Continuation<? super BrowseResponse> continuation) {
        String str3 = String.format(ApiPaths.URL_BROWSE, Arrays.copyOf(new Object[]{str, str2}, 2));
        Intrinsics.i(str3, "format(this, *args)");
        return this.constructorApi.getBrowseResultsCRT(q2.f93563c + str3 + getAdditionalParamsQueryString(pairArr), continuation);
    }

    public final Object getRecommendationResultsCRT(String str, Pair<String, String>[] pairArr, Continuation<? super RecommendationsResponse> continuation) {
        String str2 = String.format(ApiPaths.URL_RECOMMENDATIONS, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.i(str2, "format(this, *args)");
        return this.constructorApi.getRecommendationResultsCRT(q2.f93563c + str2 + getAdditionalParamsQueryString(pairArr), continuation);
    }

    public final Object getSearchResultsCRT(String str, Pair<String, String>[] pairArr, Continuation<? super SearchResponse> continuation) {
        String str2 = String.format(ApiPaths.URL_SEARCH, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.i(str2, "format(this, *args)");
        return this.constructorApi.getSearchResultsCRT(q2.f93563c + str2 + getAdditionalParamsQueryString(pairArr), continuation);
    }

    public DataManager(ConstructorApi constructorApi, t moshi) {
        Intrinsics.j(constructorApi, "constructorApi");
        Intrinsics.j(moshi, "moshi");
        this.constructorApi = constructorApi;
        this.moshi = moshi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l getAutocompleteResults$default(DataManager dataManager, String str, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getAutocompleteResults(str, pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAutocompleteResults$lambda-3, reason: not valid java name */
    public static final ConstructorData m95getAutocompleteResults$lambda3(DataManager this$0, Result result) {
        ConstructorData constructorDataNetworkError;
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(result, "result");
        if (result.isError()) {
            return ConstructorData.INSTANCE.error(result.error());
        }
        Response response = result.response();
        ConstructorData constructorData = null;
        if (response != null) {
            if (response.isSuccessful()) {
                com.squareup.moshi.h hVarC = this$0.moshi.c(AutocompleteResponse.class);
                ResponseBody responseBody = (ResponseBody) response.body();
                String strString = responseBody == null ? null : responseBody.string();
                AutocompleteResponse autocompleteResponse = strString != null ? (AutocompleteResponse) hVarC.fromJson(strString) : null;
                if (autocompleteResponse != null) {
                    autocompleteResponse.setRawData(strString);
                }
                ConstructorData.Companion companion = ConstructorData.INSTANCE;
                Intrinsics.g(autocompleteResponse);
                constructorDataNetworkError = companion.of(autocompleteResponse);
            } else {
                ConstructorData.Companion companion2 = ConstructorData.INSTANCE;
                ResponseBody responseBodyErrorBody = response.errorBody();
                constructorDataNetworkError = companion2.networkError(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
            }
            constructorData = constructorDataNetworkError;
        }
        return constructorData == null ? ConstructorData.INSTANCE.error(result.error()) : constructorData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getAutocompleteResultsCRT$default(DataManager dataManager, String str, Pair[] pairArr, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getAutocompleteResultsCRT(str, pairArr, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l getBrowseFacetOptions$default(DataManager dataManager, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getBrowseFacetOptions(pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBrowseFacetOptions$lambda-18, reason: not valid java name */
    public static final ConstructorData m96getBrowseFacetOptions$lambda18(DataManager this$0, Result result) {
        ConstructorData constructorDataNetworkError;
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(result, "result");
        if (result.isError()) {
            return ConstructorData.INSTANCE.error(result.error());
        }
        Response response = result.response();
        ConstructorData constructorData = null;
        if (response != null) {
            if (response.isSuccessful()) {
                com.squareup.moshi.h hVarC = this$0.moshi.c(BrowseFacetOptionsResponse.class);
                ResponseBody responseBody = (ResponseBody) response.body();
                String strString = responseBody == null ? null : responseBody.string();
                BrowseFacetOptionsResponse browseFacetOptionsResponse = strString != null ? (BrowseFacetOptionsResponse) hVarC.fromJson(strString) : null;
                if (browseFacetOptionsResponse != null) {
                    browseFacetOptionsResponse.setRawData(strString);
                }
                ConstructorData.Companion companion = ConstructorData.INSTANCE;
                Intrinsics.g(browseFacetOptionsResponse);
                constructorDataNetworkError = companion.of(browseFacetOptionsResponse);
            } else {
                ConstructorData.Companion companion2 = ConstructorData.INSTANCE;
                ResponseBody responseBodyErrorBody = response.errorBody();
                constructorDataNetworkError = companion2.networkError(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
            }
            constructorData = constructorDataNetworkError;
        }
        return constructorData == null ? ConstructorData.INSTANCE.error(result.error()) : constructorData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getBrowseFacetOptionsCRT$default(DataManager dataManager, Pair[] pairArr, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getBrowseFacetOptionsCRT(pairArr, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l getBrowseFacets$default(DataManager dataManager, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getBrowseFacets(pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBrowseFacets$lambda-15, reason: not valid java name */
    public static final ConstructorData m97getBrowseFacets$lambda15(DataManager this$0, Result result) {
        ConstructorData constructorDataNetworkError;
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(result, "result");
        if (result.isError()) {
            return ConstructorData.INSTANCE.error(result.error());
        }
        Response response = result.response();
        ConstructorData constructorData = null;
        if (response != null) {
            if (response.isSuccessful()) {
                com.squareup.moshi.h hVarC = this$0.moshi.c(BrowseFacetsResponse.class);
                ResponseBody responseBody = (ResponseBody) response.body();
                String strString = responseBody == null ? null : responseBody.string();
                BrowseFacetsResponse browseFacetsResponse = strString != null ? (BrowseFacetsResponse) hVarC.fromJson(strString) : null;
                if (browseFacetsResponse != null) {
                    browseFacetsResponse.setRawData(strString);
                }
                ConstructorData.Companion companion = ConstructorData.INSTANCE;
                Intrinsics.g(browseFacetsResponse);
                constructorDataNetworkError = companion.of(browseFacetsResponse);
            } else {
                ConstructorData.Companion companion2 = ConstructorData.INSTANCE;
                ResponseBody responseBodyErrorBody = response.errorBody();
                constructorDataNetworkError = companion2.networkError(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
            }
            constructorData = constructorDataNetworkError;
        }
        return constructorData == null ? ConstructorData.INSTANCE.error(result.error()) : constructorData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getBrowseFacetsCRT$default(DataManager dataManager, Pair[] pairArr, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getBrowseFacetsCRT(pairArr, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l getBrowseGroups$default(DataManager dataManager, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getBrowseGroups(pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBrowseGroups$lambda-21, reason: not valid java name */
    public static final ConstructorData m98getBrowseGroups$lambda21(DataManager this$0, Result result) {
        ConstructorData constructorDataNetworkError;
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(result, "result");
        if (result.isError()) {
            return ConstructorData.INSTANCE.error(result.error());
        }
        Response response = result.response();
        ConstructorData constructorData = null;
        if (response != null) {
            if (response.isSuccessful()) {
                com.squareup.moshi.h hVarC = this$0.moshi.c(BrowseGroupsResponse.class);
                ResponseBody responseBody = (ResponseBody) response.body();
                String strString = responseBody == null ? null : responseBody.string();
                BrowseGroupsResponse browseGroupsResponse = strString != null ? (BrowseGroupsResponse) hVarC.fromJson(strString) : null;
                if (browseGroupsResponse != null) {
                    browseGroupsResponse.setRawData(strString);
                }
                ConstructorData.Companion companion = ConstructorData.INSTANCE;
                Intrinsics.g(browseGroupsResponse);
                constructorDataNetworkError = companion.of(browseGroupsResponse);
            } else {
                ConstructorData.Companion companion2 = ConstructorData.INSTANCE;
                ResponseBody responseBodyErrorBody = response.errorBody();
                constructorDataNetworkError = companion2.networkError(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
            }
            constructorData = constructorDataNetworkError;
        }
        return constructorData == null ? ConstructorData.INSTANCE.error(result.error()) : constructorData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getBrowseGroupsCRT$default(DataManager dataManager, Pair[] pairArr, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getBrowseGroupsCRT(pairArr, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l getBrowseItemsResults$default(DataManager dataManager, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getBrowseItemsResults(pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBrowseItemsResults$lambda-12, reason: not valid java name */
    public static final ConstructorData m99getBrowseItemsResults$lambda12(DataManager this$0, Result result) {
        ConstructorData constructorDataNetworkError;
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(result, "result");
        if (result.isError()) {
            return ConstructorData.INSTANCE.error(result.error());
        }
        Response response = result.response();
        ConstructorData constructorData = null;
        if (response != null) {
            if (response.isSuccessful()) {
                com.squareup.moshi.h hVarC = this$0.moshi.c(BrowseResponse.class);
                ResponseBody responseBody = (ResponseBody) response.body();
                String strString = responseBody == null ? null : responseBody.string();
                BrowseResponse browseResponse = strString != null ? (BrowseResponse) hVarC.fromJson(strString) : null;
                if (browseResponse != null) {
                    browseResponse.setRawData(strString);
                }
                ConstructorData.Companion companion = ConstructorData.INSTANCE;
                Intrinsics.g(browseResponse);
                constructorDataNetworkError = companion.of(browseResponse);
            } else {
                ConstructorData.Companion companion2 = ConstructorData.INSTANCE;
                ResponseBody responseBodyErrorBody = response.errorBody();
                constructorDataNetworkError = companion2.networkError(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
            }
            constructorData = constructorDataNetworkError;
        }
        return constructorData == null ? ConstructorData.INSTANCE.error(result.error()) : constructorData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getBrowseItemsResultsCRT$default(DataManager dataManager, Pair[] pairArr, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getBrowseItemsResultsCRT(pairArr, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l getBrowseResults$default(DataManager dataManager, String str, String str2, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getBrowseResults(str, str2, pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBrowseResults$lambda-9, reason: not valid java name */
    public static final ConstructorData m100getBrowseResults$lambda9(DataManager this$0, Result result) {
        ConstructorData constructorDataNetworkError;
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(result, "result");
        if (result.isError()) {
            return ConstructorData.INSTANCE.error(result.error());
        }
        Response response = result.response();
        ConstructorData constructorData = null;
        if (response != null) {
            if (response.isSuccessful()) {
                com.squareup.moshi.h hVarC = this$0.moshi.c(BrowseResponse.class);
                ResponseBody responseBody = (ResponseBody) response.body();
                String strString = responseBody == null ? null : responseBody.string();
                BrowseResponse browseResponse = strString != null ? (BrowseResponse) hVarC.fromJson(strString) : null;
                if (browseResponse != null) {
                    browseResponse.setRawData(strString);
                }
                ConstructorData.Companion companion = ConstructorData.INSTANCE;
                Intrinsics.g(browseResponse);
                constructorDataNetworkError = companion.of(browseResponse);
            } else {
                ConstructorData.Companion companion2 = ConstructorData.INSTANCE;
                ResponseBody responseBodyErrorBody = response.errorBody();
                constructorDataNetworkError = companion2.networkError(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
            }
            constructorData = constructorDataNetworkError;
        }
        return constructorData == null ? ConstructorData.INSTANCE.error(result.error()) : constructorData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getBrowseResultsCRT$default(DataManager dataManager, String str, String str2, Pair[] pairArr, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getBrowseResultsCRT(str, str2, pairArr, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l getQuizNextQuestion$default(DataManager dataManager, String str, Pair[] pairArr, PreferencesHelper preferencesHelper, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getQuizNextQuestion(str, pairArr, preferencesHelper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getQuizNextQuestion$lambda-27, reason: not valid java name */
    public static final ConstructorData m101getQuizNextQuestion$lambda27(DataManager this$0, Result it) {
        ConstructorData constructorDataNetworkError;
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        if (it.isError()) {
            return ConstructorData.INSTANCE.error(it.error());
        }
        Response response = it.response();
        ConstructorData constructorData = null;
        if (response != null) {
            if (response.isSuccessful()) {
                com.squareup.moshi.h hVarC = this$0.moshi.c(QuizQuestionResponse.class);
                ResponseBody responseBody = (ResponseBody) response.body();
                String strString = responseBody == null ? null : responseBody.string();
                QuizQuestionResponse quizQuestionResponse = strString != null ? (QuizQuestionResponse) hVarC.fromJson(strString) : null;
                if (quizQuestionResponse != null) {
                    quizQuestionResponse.setRawData(strString);
                }
                ConstructorData.Companion companion = ConstructorData.INSTANCE;
                Intrinsics.g(quizQuestionResponse);
                constructorDataNetworkError = companion.of(quizQuestionResponse);
            } else {
                ConstructorData.Companion companion2 = ConstructorData.INSTANCE;
                ResponseBody responseBodyErrorBody = response.errorBody();
                constructorDataNetworkError = companion2.networkError(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
            }
            constructorData = constructorDataNetworkError;
        }
        return constructorData == null ? ConstructorData.INSTANCE.error(it.error()) : constructorData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getQuizNextQuestionCRT$default(DataManager dataManager, String str, Pair[] pairArr, PreferencesHelper preferencesHelper, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getQuizNextQuestionCRT(str, pairArr, preferencesHelper, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l getQuizResults$default(DataManager dataManager, String str, Pair[] pairArr, PreferencesHelper preferencesHelper, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getQuizResults(str, pairArr, preferencesHelper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getQuizResults$lambda-30, reason: not valid java name */
    public static final ConstructorData m102getQuizResults$lambda30(DataManager this$0, Result it) {
        ConstructorData constructorDataNetworkError;
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        if (it.isError()) {
            return ConstructorData.INSTANCE.error(it.error());
        }
        Response response = it.response();
        ConstructorData constructorData = null;
        if (response != null) {
            if (response.isSuccessful()) {
                com.squareup.moshi.h hVarC = this$0.moshi.c(QuizResultsResponse.class);
                ResponseBody responseBody = (ResponseBody) response.body();
                String strString = responseBody == null ? null : responseBody.string();
                QuizResultsResponse quizResultsResponse = strString != null ? (QuizResultsResponse) hVarC.fromJson(strString) : null;
                if (quizResultsResponse != null) {
                    quizResultsResponse.setRawData(strString);
                }
                ConstructorData.Companion companion = ConstructorData.INSTANCE;
                Intrinsics.g(quizResultsResponse);
                constructorDataNetworkError = companion.of(quizResultsResponse);
            } else {
                ConstructorData.Companion companion2 = ConstructorData.INSTANCE;
                ResponseBody responseBodyErrorBody = response.errorBody();
                constructorDataNetworkError = companion2.networkError(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
            }
            constructorData = constructorDataNetworkError;
        }
        return constructorData == null ? ConstructorData.INSTANCE.error(it.error()) : constructorData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getQuizResultsCRT$default(DataManager dataManager, String str, Pair[] pairArr, PreferencesHelper preferencesHelper, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getQuizResultsCRT(str, pairArr, preferencesHelper, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l getRecommendationResults$default(DataManager dataManager, String str, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getRecommendationResults(str, pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRecommendationResults$lambda-24, reason: not valid java name */
    public static final ConstructorData m103getRecommendationResults$lambda24(DataManager this$0, Result it) {
        ConstructorData constructorDataNetworkError;
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        if (it.isError()) {
            return ConstructorData.INSTANCE.error(it.error());
        }
        Response response = it.response();
        ConstructorData constructorData = null;
        if (response != null) {
            if (response.isSuccessful()) {
                com.squareup.moshi.h hVarC = this$0.moshi.c(RecommendationsResponse.class);
                ResponseBody responseBody = (ResponseBody) response.body();
                String strString = responseBody == null ? null : responseBody.string();
                RecommendationsResponse recommendationsResponse = strString != null ? (RecommendationsResponse) hVarC.fromJson(strString) : null;
                if (recommendationsResponse != null) {
                    recommendationsResponse.setRawData(strString);
                }
                ConstructorData.Companion companion = ConstructorData.INSTANCE;
                Intrinsics.g(recommendationsResponse);
                constructorDataNetworkError = companion.of(recommendationsResponse);
            } else {
                ConstructorData.Companion companion2 = ConstructorData.INSTANCE;
                ResponseBody responseBodyErrorBody = response.errorBody();
                constructorDataNetworkError = companion2.networkError(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
            }
            constructorData = constructorDataNetworkError;
        }
        return constructorData == null ? ConstructorData.INSTANCE.error(it.error()) : constructorData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getRecommendationResultsCRT$default(DataManager dataManager, String str, Pair[] pairArr, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getRecommendationResultsCRT(str, pairArr, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l getSearchResults$default(DataManager dataManager, String str, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getSearchResults(str, pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getSearchResults$lambda-6, reason: not valid java name */
    public static final ConstructorData m104getSearchResults$lambda6(DataManager this$0, Result result) {
        ConstructorData constructorDataNetworkError;
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(result, "result");
        if (result.isError()) {
            return ConstructorData.INSTANCE.error(result.error());
        }
        Response response = result.response();
        ConstructorData constructorData = null;
        if (response != null) {
            if (response.isSuccessful()) {
                com.squareup.moshi.h hVarC = this$0.moshi.c(SearchResponse.class);
                ResponseBody responseBody = (ResponseBody) response.body();
                String strString = responseBody == null ? null : responseBody.string();
                SearchResponse searchResponse = strString != null ? (SearchResponse) hVarC.fromJson(strString) : null;
                if (searchResponse != null) {
                    searchResponse.setRawData(strString);
                }
                ConstructorData.Companion companion = ConstructorData.INSTANCE;
                Intrinsics.g(searchResponse);
                constructorDataNetworkError = companion.of(searchResponse);
            } else {
                ConstructorData.Companion companion2 = ConstructorData.INSTANCE;
                ResponseBody responseBodyErrorBody = response.errorBody();
                constructorDataNetworkError = companion2.networkError(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
            }
            constructorData = constructorDataNetworkError;
        }
        return constructorData == null ? ConstructorData.INSTANCE.error(result.error()) : constructorData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getSearchResultsCRT$default(DataManager dataManager, String str, Pair[] pairArr, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.getSearchResultsCRT(str, pairArr, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.reactivex.b trackAutocompleteSelect$default(DataManager dataManager, String str, Pair[] pairArr, Pair[] pairArr2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        if ((i10 & 4) != 0) {
            pairArr2 = new Pair[0];
        }
        return dataManager.trackAutocompleteSelect(str, pairArr, pairArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.reactivex.b trackBrowseResultClick$default(DataManager dataManager, BrowseResultClickRequestBody browseResultClickRequestBody, Pair[] pairArr, Pair[] pairArr2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        if ((i10 & 4) != 0) {
            pairArr2 = new Pair[0];
        }
        return dataManager.trackBrowseResultClick(browseResultClickRequestBody, pairArr, pairArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.reactivex.b trackConversion$default(DataManager dataManager, ConversionRequestBody conversionRequestBody, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.trackConversion(conversionRequestBody, pairArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.reactivex.b trackQuizConversion$default(DataManager dataManager, QuizConversionRequestBody quizConversionRequestBody, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.trackQuizConversion(quizConversionRequestBody, pairArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.reactivex.b trackQuizResultClick$default(DataManager dataManager, QuizResultClickRequestBody quizResultClickRequestBody, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.trackQuizResultClick(quizResultClickRequestBody, pairArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.reactivex.b trackQuizResultLoad$default(DataManager dataManager, QuizResultLoadRequestBody quizResultLoadRequestBody, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.trackQuizResultLoad(quizResultLoadRequestBody, pairArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.reactivex.b trackRecommendationResultClick$default(DataManager dataManager, RecommendationResultClickRequestBody recommendationResultClickRequestBody, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.trackRecommendationResultClick(recommendationResultClickRequestBody, pairArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.reactivex.b trackRecommendationResultsView$default(DataManager dataManager, RecommendationResultViewRequestBody recommendationResultViewRequestBody, Pair[] pairArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        return dataManager.trackRecommendationResultsView(recommendationResultViewRequestBody, pairArr);
    }

    public static /* synthetic */ io.reactivex.b trackSearchResultClick$default(DataManager dataManager, String str, String str2, String str3, String str4, Pair[] pairArr, Pair[] pairArr2, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            pairArr = new Pair[0];
        }
        Pair[] pairArr3 = pairArr;
        if ((i10 & 32) != 0) {
            pairArr2 = new Pair[0];
        }
        return dataManager.trackSearchResultClick(str, str2, str3, str4, pairArr3, pairArr2);
    }

    public static /* synthetic */ io.reactivex.b trackSearchResultsLoaded$default(DataManager dataManager, String str, int i10, String[] strArr, Pair[] pairArr, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            strArr = null;
        }
        return dataManager.trackSearchResultsLoaded(str, i10, strArr, pairArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.reactivex.b trackSearchSubmit$default(DataManager dataManager, String str, Pair[] pairArr, Pair[] pairArr2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pairArr = new Pair[0];
        }
        if ((i10 & 4) != 0) {
            pairArr2 = new Pair[0];
        }
        return dataManager.trackSearchSubmit(str, pairArr, pairArr2);
    }

    public final l<ConstructorData<AutocompleteResponse>> getAutocompleteResults(String term, Pair<String, String>[] encodedParams) {
        Intrinsics.j(term, "term");
        Intrinsics.j(encodedParams, "encodedParams");
        String str = String.format(ApiPaths.URL_AUTOCOMPLETE, Arrays.copyOf(new Object[]{term}, 1));
        Intrinsics.i(str, "format(this, *args)");
        l<ConstructorData<AutocompleteResponse>> lVarR = this.constructorApi.getAutocompleteResults(q2.f93563c + str + getAdditionalParamsQueryString(encodedParams)).j(new o() { // from class: io.constructor.data.e
            @Override // Lu.o
            public final Object apply(Object obj) {
                return DataManager.m95getAutocompleteResults$lambda3(this.f138799a, (Result) obj);
            }
        }).r();
        Intrinsics.i(lVarR, "constructorApi.getAutoco…\n        }.toObservable()");
        return lVarR;
    }

    public final l<ConstructorData<BrowseFacetOptionsResponse>> getBrowseFacetOptions(Pair<String, String>[] encodedParams) {
        Intrinsics.j(encodedParams, "encodedParams");
        l<ConstructorData<BrowseFacetOptionsResponse>> lVarR = this.constructorApi.getBrowseFacetOptionsResults("/browse/facet_options" + getAdditionalParamsQueryString(encodedParams)).j(new o() { // from class: io.constructor.data.j
            @Override // Lu.o
            public final Object apply(Object obj) {
                return DataManager.m96getBrowseFacetOptions$lambda18(this.f138804a, (Result) obj);
            }
        }).r();
        Intrinsics.i(lVarR, "constructorApi.getBrowse…\n        }.toObservable()");
        return lVarR;
    }

    public final l<ConstructorData<BrowseFacetsResponse>> getBrowseFacets(Pair<String, String>[] encodedParams) {
        Intrinsics.j(encodedParams, "encodedParams");
        l<ConstructorData<BrowseFacetsResponse>> lVarR = this.constructorApi.getBrowseFacetsResults("/browse/facets" + getAdditionalParamsQueryString(encodedParams)).j(new o() { // from class: io.constructor.data.f
            @Override // Lu.o
            public final Object apply(Object obj) {
                return DataManager.m97getBrowseFacets$lambda15(this.f138800a, (Result) obj);
            }
        }).r();
        Intrinsics.i(lVarR, "constructorApi.getBrowse…\n        }.toObservable()");
        return lVarR;
    }

    public final l<ConstructorData<BrowseGroupsResponse>> getBrowseGroups(Pair<String, String>[] encodedParams) {
        Intrinsics.j(encodedParams, "encodedParams");
        l<ConstructorData<BrowseGroupsResponse>> lVarR = this.constructorApi.getBrowseGroupsResults("/browse/groups" + getAdditionalParamsQueryString(encodedParams)).j(new o() { // from class: io.constructor.data.h
            @Override // Lu.o
            public final Object apply(Object obj) {
                return DataManager.m98getBrowseGroups$lambda21(this.f138802a, (Result) obj);
            }
        }).r();
        Intrinsics.i(lVarR, "constructorApi.getBrowse…\n        }.toObservable()");
        return lVarR;
    }

    public final l<ConstructorData<BrowseResponse>> getBrowseItemsResults(Pair<String, String>[] encodedParams) {
        Intrinsics.j(encodedParams, "encodedParams");
        l<ConstructorData<BrowseResponse>> lVarR = this.constructorApi.getBrowseResults("/browse/items" + getAdditionalParamsQueryString(encodedParams)).j(new o() { // from class: io.constructor.data.c
            @Override // Lu.o
            public final Object apply(Object obj) {
                return DataManager.m99getBrowseItemsResults$lambda12(this.f138797a, (Result) obj);
            }
        }).r();
        Intrinsics.i(lVarR, "constructorApi.getBrowse…\n        }.toObservable()");
        return lVarR;
    }

    public final l<ConstructorData<BrowseResponse>> getBrowseResults(String filterName, String filterValue, Pair<String, String>[] encodedParams) {
        Intrinsics.j(filterName, "filterName");
        Intrinsics.j(filterValue, "filterValue");
        Intrinsics.j(encodedParams, "encodedParams");
        String str = String.format(ApiPaths.URL_BROWSE, Arrays.copyOf(new Object[]{filterName, filterValue}, 2));
        Intrinsics.i(str, "format(this, *args)");
        l<ConstructorData<BrowseResponse>> lVarR = this.constructorApi.getBrowseResults(q2.f93563c + str + getAdditionalParamsQueryString(encodedParams)).j(new o() { // from class: io.constructor.data.g
            @Override // Lu.o
            public final Object apply(Object obj) {
                return DataManager.m100getBrowseResults$lambda9(this.f138801a, (Result) obj);
            }
        }).r();
        Intrinsics.i(lVarR, "constructorApi.getBrowse…\n        }.toObservable()");
        return lVarR;
    }

    public final l<ConstructorData<QuizQuestionResponse>> getQuizNextQuestion(String quizId, Pair<String, String>[] encodedParams, PreferencesHelper preferencesHelper) {
        Intrinsics.j(quizId, "quizId");
        Intrinsics.j(encodedParams, "encodedParams");
        Intrinsics.j(preferencesHelper, "preferencesHelper");
        String scheme = preferencesHelper.getScheme();
        String quizzesServiceUrl = preferencesHelper.getQuizzesServiceUrl();
        String str = String.format(ApiPaths.URL_QUIZ_NEXT_QUESTION, Arrays.copyOf(new Object[]{quizId}, 1));
        Intrinsics.i(str, "format(this, *args)");
        l<ConstructorData<QuizQuestionResponse>> lVarR = this.constructorApi.getQuizNextQuestion(scheme + "://" + quizzesServiceUrl + q2.f93563c + str + getAdditionalParamsQueryString(encodedParams)).j(new o() { // from class: io.constructor.data.b
            @Override // Lu.o
            public final Object apply(Object obj) {
                return DataManager.m101getQuizNextQuestion$lambda27(this.f138796a, (Result) obj);
            }
        }).r();
        Intrinsics.i(lVarR, "constructorApi.getQuizNe…\n        }.toObservable()");
        return lVarR;
    }

    public final l<ConstructorData<QuizResultsResponse>> getQuizResults(String quizId, Pair<String, String>[] encodedParams, PreferencesHelper preferencesHelper) {
        Intrinsics.j(quizId, "quizId");
        Intrinsics.j(encodedParams, "encodedParams");
        Intrinsics.j(preferencesHelper, "preferencesHelper");
        String scheme = preferencesHelper.getScheme();
        String quizzesServiceUrl = preferencesHelper.getQuizzesServiceUrl();
        String str = String.format(ApiPaths.URL_QUIZ_RESULTS, Arrays.copyOf(new Object[]{quizId}, 1));
        Intrinsics.i(str, "format(this, *args)");
        l<ConstructorData<QuizResultsResponse>> lVarR = this.constructorApi.getQuizResults(scheme + "://" + quizzesServiceUrl + q2.f93563c + str + getAdditionalParamsQueryString(encodedParams)).j(new o() { // from class: io.constructor.data.d
            @Override // Lu.o
            public final Object apply(Object obj) {
                return DataManager.m102getQuizResults$lambda30(this.f138798a, (Result) obj);
            }
        }).r();
        Intrinsics.i(lVarR, "constructorApi.getQuizRe…\n        }.toObservable()");
        return lVarR;
    }

    public final l<ConstructorData<RecommendationsResponse>> getRecommendationResults(String podId, Pair<String, String>[] encodedParams) {
        Intrinsics.j(podId, "podId");
        Intrinsics.j(encodedParams, "encodedParams");
        String str = String.format(ApiPaths.URL_RECOMMENDATIONS, Arrays.copyOf(new Object[]{podId}, 1));
        Intrinsics.i(str, "format(this, *args)");
        l<ConstructorData<RecommendationsResponse>> lVarR = this.constructorApi.getRecommendationResults(q2.f93563c + str + getAdditionalParamsQueryString(encodedParams)).j(new o() { // from class: io.constructor.data.a
            @Override // Lu.o
            public final Object apply(Object obj) {
                return DataManager.m103getRecommendationResults$lambda24(this.f138795a, (Result) obj);
            }
        }).r();
        Intrinsics.i(lVarR, "constructorApi.getRecomm…\n        }.toObservable()");
        return lVarR;
    }

    public final l<ConstructorData<SearchResponse>> getSearchResults(String term, Pair<String, String>[] encodedParams) {
        Intrinsics.j(term, "term");
        Intrinsics.j(encodedParams, "encodedParams");
        String str = String.format(ApiPaths.URL_SEARCH, Arrays.copyOf(new Object[]{term}, 1));
        Intrinsics.i(str, "format(this, *args)");
        l<ConstructorData<SearchResponse>> lVarR = this.constructorApi.getSearchResults(q2.f93563c + str + getAdditionalParamsQueryString(encodedParams)).j(new o() { // from class: io.constructor.data.i
            @Override // Lu.o
            public final Object apply(Object obj) {
                return DataManager.m104getSearchResults$lambda6(this.f138803a, (Result) obj);
            }
        }).r();
        Intrinsics.i(lVarR, "constructorApi.getSearch…\n        }.toObservable()");
        return lVarR;
    }

    public final io.reactivex.b trackAutocompleteSelect(String term, Pair<String, String>[] params, Pair<String, String>[] encodedParams) {
        Intrinsics.j(term, "term");
        Intrinsics.j(params, "params");
        Intrinsics.j(encodedParams, "encodedParams");
        return this.constructorApi.trackAutocompleteSelect(term, MapsKt.B(params), MapsKt.B(encodedParams));
    }

    public final io.reactivex.b trackBrowseResultClick(BrowseResultClickRequestBody browseResultClickRequestBody, Pair<String, String>[] params, Pair<String, String>[] encodedParams) {
        Intrinsics.j(browseResultClickRequestBody, "browseResultClickRequestBody");
        Intrinsics.j(params, "params");
        Intrinsics.j(encodedParams, "encodedParams");
        return this.constructorApi.trackBrowseResultClick(browseResultClickRequestBody, MapsKt.B(params), MapsKt.B(encodedParams));
    }

    public final io.reactivex.b trackBrowseResultsLoaded(BrowseResultLoadRequestBody browseResultLoadRequestBody, Pair<String, String>[] params) {
        Intrinsics.j(browseResultLoadRequestBody, "browseResultLoadRequestBody");
        Intrinsics.j(params, "params");
        return this.constructorApi.trackBrowseResultsLoaded(browseResultLoadRequestBody, MapsKt.B(params));
    }

    public final io.reactivex.b trackConversion(ConversionRequestBody conversionRequestBody, Pair<String, String>[] params) {
        Intrinsics.j(conversionRequestBody, "conversionRequestBody");
        Intrinsics.j(params, "params");
        return this.constructorApi.trackConversion(conversionRequestBody, MapsKt.B(params));
    }

    public final io.reactivex.b trackGenericResultClick(GenericResultClickRequestBody genericResultClickRequestBody, Pair<String, String>[] params) {
        Intrinsics.j(genericResultClickRequestBody, "genericResultClickRequestBody");
        Intrinsics.j(params, "params");
        return this.constructorApi.trackGenericResultClick(genericResultClickRequestBody, MapsKt.B(params));
    }

    public final io.reactivex.b trackInputFocus(String term, Pair<String, String>[] params) {
        Intrinsics.j(params, "params");
        return this.constructorApi.trackInputFocus(term, MapsKt.B(params));
    }

    public final io.reactivex.b trackItemDetailLoaded(ItemDetailLoadRequestBody itemDetailLoadRequestBody, Pair<String, String>[] params) {
        Intrinsics.j(itemDetailLoadRequestBody, "itemDetailLoadRequestBody");
        Intrinsics.j(params, "params");
        return this.constructorApi.trackItemDetailLoaded(itemDetailLoadRequestBody, MapsKt.B(params));
    }

    public final io.reactivex.b trackPurchase(PurchaseRequestBody purchaseRequestBody, Pair<String, String>[] params) {
        Intrinsics.j(purchaseRequestBody, "purchaseRequestBody");
        Intrinsics.j(params, "params");
        return this.constructorApi.trackPurchase(purchaseRequestBody, MapsKt.B(params));
    }

    public final io.reactivex.b trackQuizConversion(QuizConversionRequestBody quizConversionRequestBody, Pair<String, String>[] params) {
        Intrinsics.j(quizConversionRequestBody, "quizConversionRequestBody");
        Intrinsics.j(params, "params");
        return this.constructorApi.trackQuizConversion(quizConversionRequestBody, MapsKt.B(params));
    }

    public final io.reactivex.b trackQuizResultClick(QuizResultClickRequestBody quizResultClickRequestBody, Pair<String, String>[] params) {
        Intrinsics.j(quizResultClickRequestBody, "quizResultClickRequestBody");
        Intrinsics.j(params, "params");
        return this.constructorApi.trackQuizResultClick(quizResultClickRequestBody, MapsKt.B(params));
    }

    public final io.reactivex.b trackQuizResultLoad(QuizResultLoadRequestBody quizResultLoadRequestBody, Pair<String, String>[] params) {
        Intrinsics.j(quizResultLoadRequestBody, "quizResultLoadRequestBody");
        Intrinsics.j(params, "params");
        return this.constructorApi.trackQuizResultLoad(quizResultLoadRequestBody, MapsKt.B(params));
    }

    public final io.reactivex.b trackRecommendationResultClick(RecommendationResultClickRequestBody recommendationResultClickRequestBody, Pair<String, String>[] params) {
        Intrinsics.j(recommendationResultClickRequestBody, "recommendationResultClickRequestBody");
        Intrinsics.j(params, "params");
        return this.constructorApi.trackRecommendationResultClick(recommendationResultClickRequestBody, MapsKt.B(params));
    }

    public final io.reactivex.b trackRecommendationResultsView(RecommendationResultViewRequestBody recommendationResultViewRequestBody, Pair<String, String>[] params) {
        Intrinsics.j(recommendationResultViewRequestBody, "recommendationResultViewRequestBody");
        Intrinsics.j(params, "params");
        return this.constructorApi.trackRecommendationResultsView(recommendationResultViewRequestBody, MapsKt.B(params));
    }

    public final io.reactivex.b trackSearchResultClick(String itemName, String customerId, String variationId, String term, Pair<String, String>[] params, Pair<String, String>[] encodedParams) {
        Intrinsics.j(itemName, "itemName");
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(term, "term");
        Intrinsics.j(params, "params");
        Intrinsics.j(encodedParams, "encodedParams");
        return this.constructorApi.trackSearchResultClick(term, itemName, customerId, variationId, MapsKt.B(params), MapsKt.B(encodedParams));
    }

    public final io.reactivex.b trackSearchResultsLoaded(String term, int resultCount, String[] customerIds, Pair<String, String>[] params) {
        List listY0;
        Intrinsics.j(term, "term");
        Intrinsics.j(params, "params");
        ConstructorApi constructorApi = this.constructorApi;
        String strB0 = null;
        if (customerIds != null && (listY0 = ArraysKt.Y0(customerIds, 60)) != null) {
            strB0 = CollectionsKt.B0(listY0, ",", null, null, 0, null, null, 62, null);
        }
        return constructorApi.trackSearchResultsLoaded(term, resultCount, strB0, MapsKt.B(params));
    }

    public final io.reactivex.b trackSearchSubmit(String term, Pair<String, String>[] params, Pair<String, String>[] encodedParams) {
        Intrinsics.j(term, "term");
        Intrinsics.j(params, "params");
        Intrinsics.j(encodedParams, "encodedParams");
        return this.constructorApi.trackSearchSubmit(term, MapsKt.B(params), MapsKt.B(encodedParams));
    }

    public final io.reactivex.b trackSessionStart(Pair<String, String>[] params) {
        Intrinsics.j(params, "params");
        return this.constructorApi.trackSessionStart(MapsKt.B(params));
    }

    public final Object getBrowseFacetOptionsCRT(Pair<String, String>[] pairArr, Continuation<? super BrowseFacetOptionsResponse> continuation) {
        return this.constructorApi.getBrowseFacetOptionsResultsCRT("/browse/facet_options" + getAdditionalParamsQueryString(pairArr), continuation);
    }

    public final Object getBrowseFacetsCRT(Pair<String, String>[] pairArr, Continuation<? super BrowseFacetsResponse> continuation) {
        return this.constructorApi.getBrowseFacetsResultsCRT("/browse/facets" + getAdditionalParamsQueryString(pairArr), continuation);
    }

    public final Object getBrowseGroupsCRT(Pair<String, String>[] pairArr, Continuation<? super BrowseGroupsResponse> continuation) {
        return this.constructorApi.getBrowseGroupsResultsCRT("/browse/groups" + getAdditionalParamsQueryString(pairArr), continuation);
    }

    public final Object getBrowseItemsResultsCRT(Pair<String, String>[] pairArr, Continuation<? super BrowseResponse> continuation) {
        return this.constructorApi.getBrowseResultsCRT("/browse/items" + getAdditionalParamsQueryString(pairArr), continuation);
    }

    public final Object getQuizNextQuestionCRT(String str, Pair<String, String>[] pairArr, PreferencesHelper preferencesHelper, Continuation<? super QuizQuestionResponse> continuation) {
        String scheme = preferencesHelper.getScheme();
        String quizzesServiceUrl = preferencesHelper.getQuizzesServiceUrl();
        String str2 = String.format(ApiPaths.URL_QUIZ_NEXT_QUESTION, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.i(str2, "format(this, *args)");
        return this.constructorApi.getQuizNextQuestionCRT(scheme + "://" + quizzesServiceUrl + q2.f93563c + str2 + getAdditionalParamsQueryString(pairArr), continuation);
    }

    public final Object getQuizResultsCRT(String str, Pair<String, String>[] pairArr, PreferencesHelper preferencesHelper, Continuation<? super QuizResultsResponse> continuation) {
        String scheme = preferencesHelper.getScheme();
        String quizzesServiceUrl = preferencesHelper.getQuizzesServiceUrl();
        String str2 = String.format(ApiPaths.URL_QUIZ_RESULTS, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.i(str2, "format(this, *args)");
        return this.constructorApi.getQuizResultsCRT(scheme + "://" + quizzesServiceUrl + q2.f93563c + str2 + getAdditionalParamsQueryString(pairArr), continuation);
    }
}
