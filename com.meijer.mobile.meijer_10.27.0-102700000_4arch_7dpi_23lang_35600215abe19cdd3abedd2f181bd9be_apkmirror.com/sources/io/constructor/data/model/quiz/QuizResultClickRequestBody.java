package io.constructor.data.model.quiz;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b9\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0015\u0012\u0016\b\u0001\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0015HÆ\u0003J\u0017\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010$J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010N\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010O\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u008c\u0002\u0010R\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00072\b\b\u0003\u0010\u0012\u001a\u00020\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00152\u0016\b\u0003\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\u00192\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\t\u0010W\u001a\u00020\u0007HÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010'R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010.\u001a\u0004\b2\u0010-R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010.\u001a\u0004\b4\u0010-R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010.\u001a\u0004\b5\u0010-R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0015¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010'¨\u0006Y"}, d2 = {"Lio/constructor/data/model/quiz/QuizResultClickRequestBody;", "Ljava/io/Serializable;", "quizId", "", "quizVersionId", "quizSessionId", "resultPage", "", "resultCount", "numResultsPerPage", "resultPositionOnPage", "resultId", "itemId", "itemName", "variationId", "c", "i", "s", "key", "ui", "us", "", "analyticsTags", "", "beacon", "", "section", "_dt", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "get_dt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnalyticsTags", "()Ljava/util/Map;", "getBeacon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getC", "()Ljava/lang/String;", "getI", "getItemId", "getItemName", "getKey", "getNumResultsPerPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuizId", "getQuizSessionId", "getQuizVersionId", "getResultCount", "getResultId", "getResultPage", "getResultPositionOnPage", "getS", "()I", "getSection", "getUi", "getUs", "()Ljava/util/List;", "getVariationId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)Lio/constructor/data/model/quiz/QuizResultClickRequestBody;", "equals", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class QuizResultClickRequestBody implements Serializable {
    private final Long _dt;
    private final Map<String, String> analyticsTags;
    private final Boolean beacon;
    private final String c;
    private final String i;
    private final String itemId;
    private final String itemName;
    private final String key;
    private final Integer numResultsPerPage;
    private final String quizId;
    private final String quizSessionId;
    private final String quizVersionId;
    private final Integer resultCount;
    private final String resultId;
    private final Integer resultPage;
    private final Integer resultPositionOnPage;
    private final int s;
    private final String section;
    private final String ui;
    private final List<String> us;
    private final String variationId;

    public QuizResultClickRequestBody(@g(name = "quiz_id") String quizId, @g(name = "quiz_version_id") String quizVersionId, @g(name = "quiz_session_id") String quizSessionId, @g(name = "result_page") Integer num, @g(name = "result_count") Integer num2, @g(name = "num_results_per_page") Integer num3, @g(name = "result_position_on_page") Integer num4, @g(name = "result_id") String str, @g(name = "item_id") String itemId, @g(name = "item_name") String str2, @g(name = "variation_id") String str3, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int i11, @g(name = "key") String key, @g(name = "ui") String str4, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> map, @g(name = "beacon") Boolean bool, @g(name = "section") String str5, @g(name = "_dt") Long l10) {
        Intrinsics.j(quizId, "quizId");
        Intrinsics.j(quizVersionId, "quizVersionId");
        Intrinsics.j(quizSessionId, "quizSessionId");
        Intrinsics.j(itemId, "itemId");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        this.quizId = quizId;
        this.quizVersionId = quizVersionId;
        this.quizSessionId = quizSessionId;
        this.resultPage = num;
        this.resultCount = num2;
        this.numResultsPerPage = num3;
        this.resultPositionOnPage = num4;
        this.resultId = str;
        this.itemId = itemId;
        this.itemName = str2;
        this.variationId = str3;
        this.c = c10;
        this.i = i10;
        this.s = i11;
        this.key = key;
        this.ui = str4;
        this.us = us2;
        this.analyticsTags = map;
        this.beacon = bool;
        this.section = str5;
        this._dt = l10;
    }

    public static /* synthetic */ QuizResultClickRequestBody copy$default(QuizResultClickRequestBody quizResultClickRequestBody, String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, String str4, String str5, String str6, String str7, String str8, String str9, int i10, String str10, String str11, List list, Map map, Boolean bool, String str12, Long l10, int i11, Object obj) {
        Long l11;
        String str13;
        String str14 = (i11 & 1) != 0 ? quizResultClickRequestBody.quizId : str;
        String str15 = (i11 & 2) != 0 ? quizResultClickRequestBody.quizVersionId : str2;
        String str16 = (i11 & 4) != 0 ? quizResultClickRequestBody.quizSessionId : str3;
        Integer num5 = (i11 & 8) != 0 ? quizResultClickRequestBody.resultPage : num;
        Integer num6 = (i11 & 16) != 0 ? quizResultClickRequestBody.resultCount : num2;
        Integer num7 = (i11 & 32) != 0 ? quizResultClickRequestBody.numResultsPerPage : num3;
        Integer num8 = (i11 & 64) != 0 ? quizResultClickRequestBody.resultPositionOnPage : num4;
        String str17 = (i11 & 128) != 0 ? quizResultClickRequestBody.resultId : str4;
        String str18 = (i11 & 256) != 0 ? quizResultClickRequestBody.itemId : str5;
        String str19 = (i11 & 512) != 0 ? quizResultClickRequestBody.itemName : str6;
        String str20 = (i11 & 1024) != 0 ? quizResultClickRequestBody.variationId : str7;
        String str21 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? quizResultClickRequestBody.c : str8;
        String str22 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quizResultClickRequestBody.i : str9;
        int i12 = (i11 & 8192) != 0 ? quizResultClickRequestBody.s : i10;
        String str23 = str14;
        String str24 = (i11 & 16384) != 0 ? quizResultClickRequestBody.key : str10;
        String str25 = (i11 & 32768) != 0 ? quizResultClickRequestBody.ui : str11;
        List list2 = (i11 & 65536) != 0 ? quizResultClickRequestBody.us : list;
        Map map2 = (i11 & 131072) != 0 ? quizResultClickRequestBody.analyticsTags : map;
        Boolean bool2 = (i11 & 262144) != 0 ? quizResultClickRequestBody.beacon : bool;
        String str26 = (i11 & 524288) != 0 ? quizResultClickRequestBody.section : str12;
        if ((i11 & 1048576) != 0) {
            str13 = str26;
            l11 = quizResultClickRequestBody._dt;
        } else {
            l11 = l10;
            str13 = str26;
        }
        return quizResultClickRequestBody.copy(str23, str15, str16, num5, num6, num7, num8, str17, str18, str19, str20, str21, str22, i12, str24, str25, list2, map2, bool2, str13, l11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuizId() {
        return this.quizId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* renamed from: component11, reason: from getter */
    public final String getVariationId() {
        return this.variationId;
    }

    /* renamed from: component12, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: component13, reason: from getter */
    public final String getI() {
        return this.i;
    }

    /* renamed from: component14, reason: from getter */
    public final int getS() {
        return this.s;
    }

    /* renamed from: component15, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component16, reason: from getter */
    public final String getUi() {
        return this.ui;
    }

    public final List<String> component17() {
        return this.us;
    }

    public final Map<String, String> component18() {
        return this.analyticsTags;
    }

    /* renamed from: component19, reason: from getter */
    public final Boolean getBeacon() {
        return this.beacon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuizVersionId() {
        return this.quizVersionId;
    }

    /* renamed from: component20, reason: from getter */
    public final String getSection() {
        return this.section;
    }

    /* renamed from: component21, reason: from getter */
    public final Long get_dt() {
        return this._dt;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQuizSessionId() {
        return this.quizSessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getResultPage() {
        return this.resultPage;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getResultCount() {
        return this.resultCount;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getNumResultsPerPage() {
        return this.numResultsPerPage;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getResultPositionOnPage() {
        return this.resultPositionOnPage;
    }

    /* renamed from: component8, reason: from getter */
    public final String getResultId() {
        return this.resultId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    public final QuizResultClickRequestBody copy(@g(name = "quiz_id") String quizId, @g(name = "quiz_version_id") String quizVersionId, @g(name = "quiz_session_id") String quizSessionId, @g(name = "result_page") Integer resultPage, @g(name = "result_count") Integer resultCount, @g(name = "num_results_per_page") Integer numResultsPerPage, @g(name = "result_position_on_page") Integer resultPositionOnPage, @g(name = "result_id") String resultId, @g(name = "item_id") String itemId, @g(name = "item_name") String itemName, @g(name = "variation_id") String variationId, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int s10, @g(name = "key") String key, @g(name = "ui") String ui2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> analyticsTags, @g(name = "beacon") Boolean beacon, @g(name = "section") String section, @g(name = "_dt") Long _dt) {
        Intrinsics.j(quizId, "quizId");
        Intrinsics.j(quizVersionId, "quizVersionId");
        Intrinsics.j(quizSessionId, "quizSessionId");
        Intrinsics.j(itemId, "itemId");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        return new QuizResultClickRequestBody(quizId, quizVersionId, quizSessionId, resultPage, resultCount, numResultsPerPage, resultPositionOnPage, resultId, itemId, itemName, variationId, c10, i10, s10, key, ui2, us2, analyticsTags, beacon, section, _dt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizResultClickRequestBody)) {
            return false;
        }
        QuizResultClickRequestBody quizResultClickRequestBody = (QuizResultClickRequestBody) other;
        return Intrinsics.e(this.quizId, quizResultClickRequestBody.quizId) && Intrinsics.e(this.quizVersionId, quizResultClickRequestBody.quizVersionId) && Intrinsics.e(this.quizSessionId, quizResultClickRequestBody.quizSessionId) && Intrinsics.e(this.resultPage, quizResultClickRequestBody.resultPage) && Intrinsics.e(this.resultCount, quizResultClickRequestBody.resultCount) && Intrinsics.e(this.numResultsPerPage, quizResultClickRequestBody.numResultsPerPage) && Intrinsics.e(this.resultPositionOnPage, quizResultClickRequestBody.resultPositionOnPage) && Intrinsics.e(this.resultId, quizResultClickRequestBody.resultId) && Intrinsics.e(this.itemId, quizResultClickRequestBody.itemId) && Intrinsics.e(this.itemName, quizResultClickRequestBody.itemName) && Intrinsics.e(this.variationId, quizResultClickRequestBody.variationId) && Intrinsics.e(this.c, quizResultClickRequestBody.c) && Intrinsics.e(this.i, quizResultClickRequestBody.i) && this.s == quizResultClickRequestBody.s && Intrinsics.e(this.key, quizResultClickRequestBody.key) && Intrinsics.e(this.ui, quizResultClickRequestBody.ui) && Intrinsics.e(this.us, quizResultClickRequestBody.us) && Intrinsics.e(this.analyticsTags, quizResultClickRequestBody.analyticsTags) && Intrinsics.e(this.beacon, quizResultClickRequestBody.beacon) && Intrinsics.e(this.section, quizResultClickRequestBody.section) && Intrinsics.e(this._dt, quizResultClickRequestBody._dt);
    }

    public int hashCode() {
        int iHashCode = ((((this.quizId.hashCode() * 31) + this.quizVersionId.hashCode()) * 31) + this.quizSessionId.hashCode()) * 31;
        Integer num = this.resultPage;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.resultCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.numResultsPerPage;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.resultPositionOnPage;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.resultId;
        int iHashCode6 = (((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31) + this.itemId.hashCode()) * 31;
        String str2 = this.itemName;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.variationId;
        int iHashCode8 = (((((((((iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.c.hashCode()) * 31) + this.i.hashCode()) * 31) + Integer.hashCode(this.s)) * 31) + this.key.hashCode()) * 31;
        String str4 = this.ui;
        int iHashCode9 = (((iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.us.hashCode()) * 31;
        Map<String, String> map = this.analyticsTags;
        int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.beacon;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.section;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l10 = this._dt;
        return iHashCode12 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "QuizResultClickRequestBody(quizId=" + this.quizId + ", quizVersionId=" + this.quizVersionId + ", quizSessionId=" + this.quizSessionId + ", resultPage=" + this.resultPage + ", resultCount=" + this.resultCount + ", numResultsPerPage=" + this.numResultsPerPage + ", resultPositionOnPage=" + this.resultPositionOnPage + ", resultId=" + this.resultId + ", itemId=" + this.itemId + ", itemName=" + this.itemName + ", variationId=" + this.variationId + ", c=" + this.c + ", i=" + this.i + ", s=" + this.s + ", key=" + this.key + ", ui=" + this.ui + ", us=" + this.us + ", analyticsTags=" + this.analyticsTags + ", beacon=" + this.beacon + ", section=" + this.section + ", _dt=" + this._dt + ")";
    }

    public final Map<String, String> getAnalyticsTags() {
        return this.analyticsTags;
    }

    public final Boolean getBeacon() {
        return this.beacon;
    }

    public final String getC() {
        return this.c;
    }

    public final String getI() {
        return this.i;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final String getKey() {
        return this.key;
    }

    public final Integer getNumResultsPerPage() {
        return this.numResultsPerPage;
    }

    public final String getQuizId() {
        return this.quizId;
    }

    public final String getQuizSessionId() {
        return this.quizSessionId;
    }

    public final String getQuizVersionId() {
        return this.quizVersionId;
    }

    public final Integer getResultCount() {
        return this.resultCount;
    }

    public final String getResultId() {
        return this.resultId;
    }

    public final Integer getResultPage() {
        return this.resultPage;
    }

    public final Integer getResultPositionOnPage() {
        return this.resultPositionOnPage;
    }

    public final int getS() {
        return this.s;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getUi() {
        return this.ui;
    }

    public final List<String> getUs() {
        return this.us;
    }

    public final String getVariationId() {
        return this.variationId;
    }

    public final Long get_dt() {
        return this._dt;
    }
}
