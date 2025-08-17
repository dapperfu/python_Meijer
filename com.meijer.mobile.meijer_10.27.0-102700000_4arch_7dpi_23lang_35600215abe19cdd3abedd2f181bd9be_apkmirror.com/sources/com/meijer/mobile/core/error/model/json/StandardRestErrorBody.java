package com.meijer.mobile.core.error.model.json;

import com.meijer.mobile.core.error.model.json.StandardRestErrorBody;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import com.squareup.moshi.t;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0017BU\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ^\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b!\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b#\u0010\u0010¨\u0006$"}, d2 = {"Lcom/meijer/mobile/core/error/model/json/StandardRestErrorBody;", "", "", "type", "title", "detail", "", "status", "traceId", "referenceCode", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/core/error/model/json/StandardRestErrorBody;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "j", "b", "h", "c", "d", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "e", "i", "f", "json_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class StandardRestErrorBody {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Lazy<t> f96119i = LazyKt.b(new Function0() { // from class: Yj.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StandardRestErrorBody.k();
        }
    });

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String detail;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer status;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String traceId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String referenceCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String source;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/core/error/model/json/StandardRestErrorBody$a;", "", "<init>", "()V", "Lcom/squareup/moshi/t;", "moshi$delegate", "Lkotlin/Lazy;", "a", "()Lcom/squareup/moshi/t;", "moshi", "json_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.core.error.model.json.StandardRestErrorBody$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final t a() {
            Object value = StandardRestErrorBody.f96119i.getValue();
            Intrinsics.i(value, "getValue(...)");
            return (t) value;
        }
    }

    public StandardRestErrorBody(@g(name = "type") String type, @g(name = "title") String title, @g(name = "detail") String detail, @g(name = "status") Integer num, @g(name = "traceId") String str, @g(name = "referenceCode") String str2, String str3) {
        Intrinsics.j(type, "type");
        Intrinsics.j(title, "title");
        Intrinsics.j(detail, "detail");
        this.type = type;
        this.title = title;
        this.detail = detail;
        this.status = num;
        this.traceId = str;
        this.referenceCode = str2;
        this.source = str3;
    }

    public static /* synthetic */ StandardRestErrorBody c(StandardRestErrorBody standardRestErrorBody, String str, String str2, String str3, Integer num, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = standardRestErrorBody.type;
        }
        if ((i10 & 2) != 0) {
            str2 = standardRestErrorBody.title;
        }
        if ((i10 & 4) != 0) {
            str3 = standardRestErrorBody.detail;
        }
        if ((i10 & 8) != 0) {
            num = standardRestErrorBody.status;
        }
        if ((i10 & 16) != 0) {
            str4 = standardRestErrorBody.traceId;
        }
        if ((i10 & 32) != 0) {
            str5 = standardRestErrorBody.referenceCode;
        }
        if ((i10 & 64) != 0) {
            str6 = standardRestErrorBody.source;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str3;
        return standardRestErrorBody.copy(str, str2, str10, num, str9, str7, str8);
    }

    public final StandardRestErrorBody copy(@g(name = "type") String type, @g(name = "title") String title, @g(name = "detail") String detail, @g(name = "status") Integer status, @g(name = "traceId") String traceId, @g(name = "referenceCode") String referenceCode, String source) {
        Intrinsics.j(type, "type");
        Intrinsics.j(title, "title");
        Intrinsics.j(detail, "detail");
        return new StandardRestErrorBody(type, title, detail, status, traceId, referenceCode, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandardRestErrorBody)) {
            return false;
        }
        StandardRestErrorBody standardRestErrorBody = (StandardRestErrorBody) other;
        return Intrinsics.e(this.type, standardRestErrorBody.type) && Intrinsics.e(this.title, standardRestErrorBody.title) && Intrinsics.e(this.detail, standardRestErrorBody.detail) && Intrinsics.e(this.status, standardRestErrorBody.status) && Intrinsics.e(this.traceId, standardRestErrorBody.traceId) && Intrinsics.e(this.referenceCode, standardRestErrorBody.referenceCode) && Intrinsics.e(this.source, standardRestErrorBody.source);
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.detail.hashCode()) * 31;
        Integer num = this.status;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.traceId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.referenceCode;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.source;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "StandardRestErrorBody(type=" + this.type + ", title=" + this.title + ", detail=" + this.detail + ", status=" + this.status + ", traceId=" + this.traceId + ", referenceCode=" + this.referenceCode + ", source=" + this.source + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t k() {
        return new t.a().d();
    }

    /* renamed from: d, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* renamed from: e, reason: from getter */
    public final String getReferenceCode() {
        return this.referenceCode;
    }

    /* renamed from: f, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: g, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: i, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: j, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public /* synthetic */ StandardRestErrorBody(String str, String str2, String str3, Integer num, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6);
    }
}
