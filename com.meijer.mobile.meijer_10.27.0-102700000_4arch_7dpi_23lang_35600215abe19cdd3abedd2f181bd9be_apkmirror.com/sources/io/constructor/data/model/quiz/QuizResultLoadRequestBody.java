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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011\u0012\u0016\b\u0001\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011HÆ\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003JÜ\u0001\u0010F\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\b2\b\b\u0003\u0010\u000e\u001a\u00020\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00112\u0016\b\u0003\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u00152\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020\bHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b-\u0010*R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006M"}, d2 = {"Lio/constructor/data/model/quiz/QuizResultLoadRequestBody;", "Ljava/io/Serializable;", "quizId", "", "quizVersionId", "quizSessionId", "url", "resultPage", "", "resultCount", "resultId", "c", "i", "s", "key", "ui", "us", "", "analyticsTags", "", "beacon", "", "section", "_dt", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "get_dt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnalyticsTags", "()Ljava/util/Map;", "getBeacon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getC", "()Ljava/lang/String;", "getI", "getKey", "getQuizId", "getQuizSessionId", "getQuizVersionId", "getResultCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResultId", "getResultPage", "getS", "()I", "getSection", "getUi", "getUrl", "getUs", "()Ljava/util/List;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)Lio/constructor/data/model/quiz/QuizResultLoadRequestBody;", "equals", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class QuizResultLoadRequestBody implements Serializable {
    private final Long _dt;
    private final Map<String, String> analyticsTags;
    private final Boolean beacon;
    private final String c;
    private final String i;
    private final String key;
    private final String quizId;
    private final String quizSessionId;
    private final String quizVersionId;
    private final Integer resultCount;
    private final String resultId;
    private final Integer resultPage;
    private final int s;
    private final String section;
    private final String ui;
    private final String url;
    private final List<String> us;

    public QuizResultLoadRequestBody(@g(name = "quiz_id") String quizId, @g(name = "quiz_version_id") String quizVersionId, @g(name = "quiz_session_id") String quizSessionId, @g(name = "url") String url, @g(name = "result_page") Integer num, @g(name = "result_count") Integer num2, @g(name = "result_id") String str, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int i11, @g(name = "key") String key, @g(name = "ui") String str2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> map, @g(name = "beacon") Boolean bool, @g(name = "section") String str3, @g(name = "_dt") Long l10) {
        Intrinsics.j(quizId, "quizId");
        Intrinsics.j(quizVersionId, "quizVersionId");
        Intrinsics.j(quizSessionId, "quizSessionId");
        Intrinsics.j(url, "url");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        this.quizId = quizId;
        this.quizVersionId = quizVersionId;
        this.quizSessionId = quizSessionId;
        this.url = url;
        this.resultPage = num;
        this.resultCount = num2;
        this.resultId = str;
        this.c = c10;
        this.i = i10;
        this.s = i11;
        this.key = key;
        this.ui = str2;
        this.us = us2;
        this.analyticsTags = map;
        this.beacon = bool;
        this.section = str3;
        this._dt = l10;
    }

    public static /* synthetic */ QuizResultLoadRequestBody copy$default(QuizResultLoadRequestBody quizResultLoadRequestBody, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, String str7, int i10, String str8, String str9, List list, Map map, Boolean bool, String str10, Long l10, int i11, Object obj) {
        Long l11;
        String str11;
        String str12;
        QuizResultLoadRequestBody quizResultLoadRequestBody2;
        Boolean bool2;
        String str13;
        String str14;
        String str15;
        Integer num3;
        Integer num4;
        String str16;
        String str17;
        String str18;
        int i12;
        String str19;
        String str20;
        List list2;
        Map map2;
        String str21 = (i11 & 1) != 0 ? quizResultLoadRequestBody.quizId : str;
        String str22 = (i11 & 2) != 0 ? quizResultLoadRequestBody.quizVersionId : str2;
        String str23 = (i11 & 4) != 0 ? quizResultLoadRequestBody.quizSessionId : str3;
        String str24 = (i11 & 8) != 0 ? quizResultLoadRequestBody.url : str4;
        Integer num5 = (i11 & 16) != 0 ? quizResultLoadRequestBody.resultPage : num;
        Integer num6 = (i11 & 32) != 0 ? quizResultLoadRequestBody.resultCount : num2;
        String str25 = (i11 & 64) != 0 ? quizResultLoadRequestBody.resultId : str5;
        String str26 = (i11 & 128) != 0 ? quizResultLoadRequestBody.c : str6;
        String str27 = (i11 & 256) != 0 ? quizResultLoadRequestBody.i : str7;
        int i13 = (i11 & 512) != 0 ? quizResultLoadRequestBody.s : i10;
        String str28 = (i11 & 1024) != 0 ? quizResultLoadRequestBody.key : str8;
        String str29 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? quizResultLoadRequestBody.ui : str9;
        List list3 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quizResultLoadRequestBody.us : list;
        Map map3 = (i11 & 8192) != 0 ? quizResultLoadRequestBody.analyticsTags : map;
        String str30 = str21;
        Boolean bool3 = (i11 & 16384) != 0 ? quizResultLoadRequestBody.beacon : bool;
        String str31 = (i11 & 32768) != 0 ? quizResultLoadRequestBody.section : str10;
        if ((i11 & 65536) != 0) {
            str11 = str31;
            l11 = quizResultLoadRequestBody._dt;
            bool2 = bool3;
            str13 = str22;
            str14 = str23;
            str15 = str24;
            num3 = num5;
            num4 = num6;
            str16 = str25;
            str17 = str26;
            str18 = str27;
            i12 = i13;
            str19 = str28;
            str20 = str29;
            list2 = list3;
            map2 = map3;
            str12 = str30;
            quizResultLoadRequestBody2 = quizResultLoadRequestBody;
        } else {
            l11 = l10;
            str11 = str31;
            str12 = str30;
            quizResultLoadRequestBody2 = quizResultLoadRequestBody;
            bool2 = bool3;
            str13 = str22;
            str14 = str23;
            str15 = str24;
            num3 = num5;
            num4 = num6;
            str16 = str25;
            str17 = str26;
            str18 = str27;
            i12 = i13;
            str19 = str28;
            str20 = str29;
            list2 = list3;
            map2 = map3;
        }
        return quizResultLoadRequestBody2.copy(str12, str13, str14, str15, num3, num4, str16, str17, str18, i12, str19, str20, list2, map2, bool2, str11, l11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuizId() {
        return this.quizId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getS() {
        return this.s;
    }

    /* renamed from: component11, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component12, reason: from getter */
    public final String getUi() {
        return this.ui;
    }

    public final List<String> component13() {
        return this.us;
    }

    public final Map<String, String> component14() {
        return this.analyticsTags;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getBeacon() {
        return this.beacon;
    }

    /* renamed from: component16, reason: from getter */
    public final String getSection() {
        return this.section;
    }

    /* renamed from: component17, reason: from getter */
    public final Long get_dt() {
        return this._dt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuizVersionId() {
        return this.quizVersionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQuizSessionId() {
        return this.quizSessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getResultPage() {
        return this.resultPage;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getResultCount() {
        return this.resultCount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getResultId() {
        return this.resultId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: component9, reason: from getter */
    public final String getI() {
        return this.i;
    }

    public final QuizResultLoadRequestBody copy(@g(name = "quiz_id") String quizId, @g(name = "quiz_version_id") String quizVersionId, @g(name = "quiz_session_id") String quizSessionId, @g(name = "url") String url, @g(name = "result_page") Integer resultPage, @g(name = "result_count") Integer resultCount, @g(name = "result_id") String resultId, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int s10, @g(name = "key") String key, @g(name = "ui") String ui2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> analyticsTags, @g(name = "beacon") Boolean beacon, @g(name = "section") String section, @g(name = "_dt") Long _dt) {
        Intrinsics.j(quizId, "quizId");
        Intrinsics.j(quizVersionId, "quizVersionId");
        Intrinsics.j(quizSessionId, "quizSessionId");
        Intrinsics.j(url, "url");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        return new QuizResultLoadRequestBody(quizId, quizVersionId, quizSessionId, url, resultPage, resultCount, resultId, c10, i10, s10, key, ui2, us2, analyticsTags, beacon, section, _dt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizResultLoadRequestBody)) {
            return false;
        }
        QuizResultLoadRequestBody quizResultLoadRequestBody = (QuizResultLoadRequestBody) other;
        return Intrinsics.e(this.quizId, quizResultLoadRequestBody.quizId) && Intrinsics.e(this.quizVersionId, quizResultLoadRequestBody.quizVersionId) && Intrinsics.e(this.quizSessionId, quizResultLoadRequestBody.quizSessionId) && Intrinsics.e(this.url, quizResultLoadRequestBody.url) && Intrinsics.e(this.resultPage, quizResultLoadRequestBody.resultPage) && Intrinsics.e(this.resultCount, quizResultLoadRequestBody.resultCount) && Intrinsics.e(this.resultId, quizResultLoadRequestBody.resultId) && Intrinsics.e(this.c, quizResultLoadRequestBody.c) && Intrinsics.e(this.i, quizResultLoadRequestBody.i) && this.s == quizResultLoadRequestBody.s && Intrinsics.e(this.key, quizResultLoadRequestBody.key) && Intrinsics.e(this.ui, quizResultLoadRequestBody.ui) && Intrinsics.e(this.us, quizResultLoadRequestBody.us) && Intrinsics.e(this.analyticsTags, quizResultLoadRequestBody.analyticsTags) && Intrinsics.e(this.beacon, quizResultLoadRequestBody.beacon) && Intrinsics.e(this.section, quizResultLoadRequestBody.section) && Intrinsics.e(this._dt, quizResultLoadRequestBody._dt);
    }

    public int hashCode() {
        int iHashCode = ((((((this.quizId.hashCode() * 31) + this.quizVersionId.hashCode()) * 31) + this.quizSessionId.hashCode()) * 31) + this.url.hashCode()) * 31;
        Integer num = this.resultPage;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.resultCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.resultId;
        int iHashCode4 = (((((((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.i.hashCode()) * 31) + Integer.hashCode(this.s)) * 31) + this.key.hashCode()) * 31;
        String str2 = this.ui;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.us.hashCode()) * 31;
        Map<String, String> map = this.analyticsTags;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.beacon;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.section;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this._dt;
        return iHashCode8 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "QuizResultLoadRequestBody(quizId=" + this.quizId + ", quizVersionId=" + this.quizVersionId + ", quizSessionId=" + this.quizSessionId + ", url=" + this.url + ", resultPage=" + this.resultPage + ", resultCount=" + this.resultCount + ", resultId=" + this.resultId + ", c=" + this.c + ", i=" + this.i + ", s=" + this.s + ", key=" + this.key + ", ui=" + this.ui + ", us=" + this.us + ", analyticsTags=" + this.analyticsTags + ", beacon=" + this.beacon + ", section=" + this.section + ", _dt=" + this._dt + ")";
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

    public final String getKey() {
        return this.key;
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

    public final int getS() {
        return this.s;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getUi() {
        return this.ui;
    }

    public final String getUrl() {
        return this.url;
    }

    public final List<String> getUs() {
        return this.us;
    }

    public final Long get_dt() {
        return this._dt;
    }
}
