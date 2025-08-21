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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0015\u0012\u0016\b\u0001\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0011HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0015HÆ\u0003J\u0017\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010 J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010%J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0080\u0002\u0010L\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00152\u0016\b\u0003\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020\u0011HÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\b\u0010%R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001e¨\u0006S"}, d2 = {"Lio/constructor/data/model/quiz/QuizConversionRequestBody;", "Ljava/io/Serializable;", "quizId", "", "quizVersionId", "quizSessionId", "displayName", "type", "isCustomType", "", "itemId", "itemName", "variationId", "Revenue", "c", "i", "s", "", "key", "ui", "us", "", "analyticsTags", "", "beacon", "section", "_dt", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "getRevenue", "()Ljava/lang/String;", "get_dt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnalyticsTags", "()Ljava/util/Map;", "getBeacon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getC", "getDisplayName", "getI", "getItemId", "getItemName", "getKey", "getQuizId", "getQuizSessionId", "getQuizVersionId", "getS", "()I", "getSection", "getType", "getUi", "getUs", "()Ljava/util/List;", "getVariationId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)Lio/constructor/data/model/quiz/QuizConversionRequestBody;", "equals", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class QuizConversionRequestBody implements Serializable {
    private final String Revenue;
    private final Long _dt;
    private final Map<String, String> analyticsTags;
    private final Boolean beacon;
    private final String c;
    private final String displayName;
    private final String i;
    private final Boolean isCustomType;
    private final String itemId;
    private final String itemName;
    private final String key;
    private final String quizId;
    private final String quizSessionId;
    private final String quizVersionId;
    private final int s;
    private final String section;
    private final String type;
    private final String ui;
    private final List<String> us;
    private final String variationId;

    public static /* synthetic */ QuizConversionRequestBody copy$default(QuizConversionRequestBody quizConversionRequestBody, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, int i10, String str12, String str13, List list, Map map, Boolean bool2, String str14, Long l10, int i11, Object obj) {
        Long l11;
        String str15;
        String str16 = (i11 & 1) != 0 ? quizConversionRequestBody.quizId : str;
        String str17 = (i11 & 2) != 0 ? quizConversionRequestBody.quizVersionId : str2;
        String str18 = (i11 & 4) != 0 ? quizConversionRequestBody.quizSessionId : str3;
        String str19 = (i11 & 8) != 0 ? quizConversionRequestBody.displayName : str4;
        String str20 = (i11 & 16) != 0 ? quizConversionRequestBody.type : str5;
        Boolean bool3 = (i11 & 32) != 0 ? quizConversionRequestBody.isCustomType : bool;
        String str21 = (i11 & 64) != 0 ? quizConversionRequestBody.itemId : str6;
        String str22 = (i11 & 128) != 0 ? quizConversionRequestBody.itemName : str7;
        String str23 = (i11 & 256) != 0 ? quizConversionRequestBody.variationId : str8;
        String str24 = (i11 & 512) != 0 ? quizConversionRequestBody.Revenue : str9;
        String str25 = (i11 & 1024) != 0 ? quizConversionRequestBody.c : str10;
        String str26 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? quizConversionRequestBody.i : str11;
        int i12 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quizConversionRequestBody.s : i10;
        String str27 = (i11 & 8192) != 0 ? quizConversionRequestBody.key : str12;
        String str28 = str16;
        String str29 = (i11 & 16384) != 0 ? quizConversionRequestBody.ui : str13;
        List list2 = (i11 & 32768) != 0 ? quizConversionRequestBody.us : list;
        Map map2 = (i11 & 65536) != 0 ? quizConversionRequestBody.analyticsTags : map;
        Boolean bool4 = (i11 & 131072) != 0 ? quizConversionRequestBody.beacon : bool2;
        String str30 = (i11 & 262144) != 0 ? quizConversionRequestBody.section : str14;
        if ((i11 & 524288) != 0) {
            str15 = str30;
            l11 = quizConversionRequestBody._dt;
        } else {
            l11 = l10;
            str15 = str30;
        }
        return quizConversionRequestBody.copy(str28, str17, str18, str19, str20, bool3, str21, str22, str23, str24, str25, str26, i12, str27, str29, list2, map2, bool4, str15, l11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuizId() {
        return this.quizId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getRevenue() {
        return this.Revenue;
    }

    /* renamed from: component11, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: component12, reason: from getter */
    public final String getI() {
        return this.i;
    }

    /* renamed from: component13, reason: from getter */
    public final int getS() {
        return this.s;
    }

    /* renamed from: component14, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component15, reason: from getter */
    public final String getUi() {
        return this.ui;
    }

    public final List<String> component16() {
        return this.us;
    }

    public final Map<String, String> component17() {
        return this.analyticsTags;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getBeacon() {
        return this.beacon;
    }

    /* renamed from: component19, reason: from getter */
    public final String getSection() {
        return this.section;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuizVersionId() {
        return this.quizVersionId;
    }

    /* renamed from: component20, reason: from getter */
    public final Long get_dt() {
        return this._dt;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQuizSessionId() {
        return this.quizSessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsCustomType() {
        return this.isCustomType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* renamed from: component9, reason: from getter */
    public final String getVariationId() {
        return this.variationId;
    }

    public final QuizConversionRequestBody copy(@g(name = "quiz_id") String quizId, @g(name = "quiz_version_id") String quizVersionId, @g(name = "quiz_session_id") String quizSessionId, @g(name = "display_name") String displayName, @g(name = "type") String type, @g(name = "is_custom_type") Boolean isCustomType, @g(name = "item_id") String itemId, @g(name = "item_name") String itemName, @g(name = "variation_id") String variationId, @g(name = "revenue") String Revenue, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int s10, @g(name = "key") String key, @g(name = "ui") String ui2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> analyticsTags, @g(name = "beacon") Boolean beacon, @g(name = "section") String section, @g(name = "_dt") Long _dt) {
        Intrinsics.j(quizId, "quizId");
        Intrinsics.j(quizVersionId, "quizVersionId");
        Intrinsics.j(quizSessionId, "quizSessionId");
        Intrinsics.j(itemId, "itemId");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        return new QuizConversionRequestBody(quizId, quizVersionId, quizSessionId, displayName, type, isCustomType, itemId, itemName, variationId, Revenue, c10, i10, s10, key, ui2, us2, analyticsTags, beacon, section, _dt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizConversionRequestBody)) {
            return false;
        }
        QuizConversionRequestBody quizConversionRequestBody = (QuizConversionRequestBody) other;
        return Intrinsics.e(this.quizId, quizConversionRequestBody.quizId) && Intrinsics.e(this.quizVersionId, quizConversionRequestBody.quizVersionId) && Intrinsics.e(this.quizSessionId, quizConversionRequestBody.quizSessionId) && Intrinsics.e(this.displayName, quizConversionRequestBody.displayName) && Intrinsics.e(this.type, quizConversionRequestBody.type) && Intrinsics.e(this.isCustomType, quizConversionRequestBody.isCustomType) && Intrinsics.e(this.itemId, quizConversionRequestBody.itemId) && Intrinsics.e(this.itemName, quizConversionRequestBody.itemName) && Intrinsics.e(this.variationId, quizConversionRequestBody.variationId) && Intrinsics.e(this.Revenue, quizConversionRequestBody.Revenue) && Intrinsics.e(this.c, quizConversionRequestBody.c) && Intrinsics.e(this.i, quizConversionRequestBody.i) && this.s == quizConversionRequestBody.s && Intrinsics.e(this.key, quizConversionRequestBody.key) && Intrinsics.e(this.ui, quizConversionRequestBody.ui) && Intrinsics.e(this.us, quizConversionRequestBody.us) && Intrinsics.e(this.analyticsTags, quizConversionRequestBody.analyticsTags) && Intrinsics.e(this.beacon, quizConversionRequestBody.beacon) && Intrinsics.e(this.section, quizConversionRequestBody.section) && Intrinsics.e(this._dt, quizConversionRequestBody._dt);
    }

    public int hashCode() {
        int iHashCode = ((((this.quizId.hashCode() * 31) + this.quizVersionId.hashCode()) * 31) + this.quizSessionId.hashCode()) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isCustomType;
        int iHashCode4 = (((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.itemId.hashCode()) * 31;
        String str3 = this.itemName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.variationId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.Revenue;
        int iHashCode7 = (((((((((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.c.hashCode()) * 31) + this.i.hashCode()) * 31) + Integer.hashCode(this.s)) * 31) + this.key.hashCode()) * 31;
        String str6 = this.ui;
        int iHashCode8 = (((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.us.hashCode()) * 31;
        Map<String, String> map = this.analyticsTags;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool2 = this.beacon;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.section;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l10 = this._dt;
        return iHashCode11 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "QuizConversionRequestBody(quizId=" + this.quizId + ", quizVersionId=" + this.quizVersionId + ", quizSessionId=" + this.quizSessionId + ", displayName=" + this.displayName + ", type=" + this.type + ", isCustomType=" + this.isCustomType + ", itemId=" + this.itemId + ", itemName=" + this.itemName + ", variationId=" + this.variationId + ", Revenue=" + this.Revenue + ", c=" + this.c + ", i=" + this.i + ", s=" + this.s + ", key=" + this.key + ", ui=" + this.ui + ", us=" + this.us + ", analyticsTags=" + this.analyticsTags + ", beacon=" + this.beacon + ", section=" + this.section + ", _dt=" + this._dt + ")";
    }

    public QuizConversionRequestBody(@g(name = "quiz_id") String quizId, @g(name = "quiz_version_id") String quizVersionId, @g(name = "quiz_session_id") String quizSessionId, @g(name = "display_name") String str, @g(name = "type") String str2, @g(name = "is_custom_type") Boolean bool, @g(name = "item_id") String itemId, @g(name = "item_name") String str3, @g(name = "variation_id") String str4, @g(name = "revenue") String str5, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int i11, @g(name = "key") String key, @g(name = "ui") String str6, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> map, @g(name = "beacon") Boolean bool2, @g(name = "section") String str7, @g(name = "_dt") Long l10) {
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
        this.displayName = str;
        this.type = str2;
        this.isCustomType = bool;
        this.itemId = itemId;
        this.itemName = str3;
        this.variationId = str4;
        this.Revenue = str5;
        this.c = c10;
        this.i = i10;
        this.s = i11;
        this.key = key;
        this.ui = str6;
        this.us = us2;
        this.analyticsTags = map;
        this.beacon = bool2;
        this.section = str7;
        this._dt = l10;
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

    public final String getDisplayName() {
        return this.displayName;
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

    public final String getQuizId() {
        return this.quizId;
    }

    public final String getQuizSessionId() {
        return this.quizSessionId;
    }

    public final String getQuizVersionId() {
        return this.quizVersionId;
    }

    public final String getRevenue() {
        return this.Revenue;
    }

    public final int getS() {
        return this.s;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getType() {
        return this.type;
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

    public final Boolean isCustomType() {
        return this.isCustomType;
    }
}
