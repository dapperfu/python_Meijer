package e6;

import Q5.C5072d;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0010B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015¨\u0006\u0016"}, d2 = {"Le6/e;", "", "", "url", "body", "contentType", "", "timeout", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "LQ5/d;", "e", "()LQ5/d;", "default", "d", "(I)I", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "I", "signal_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: e6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13629e {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String body;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String contentType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int timeout;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Le6/e$a;", "", "<init>", "()V", "LQ5/d;", "dataEntity", "Le6/e;", "a", "(LQ5/d;)Le6/e;", "", "BODY", "Ljava/lang/String;", "CONTENT_TYPE", "EMPTY_JSON", "TIME_OUT", "URL", "signal_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: e6.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final C13629e a(C5072d dataEntity) {
            JSONObject jSONObject;
            Intrinsics.j(dataEntity, "dataEntity");
            String strA = dataEntity.a();
            if (strA == null) {
                strA = "";
            }
            try {
                jSONObject = new JSONObject(strA);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            String strOptString = jSONObject.optString("url");
            Intrinsics.i(strOptString, "jsonObject.optString(URL)");
            String strOptString2 = jSONObject.optString("body");
            Intrinsics.i(strOptString2, "jsonObject.optString(BODY)");
            String strOptString3 = jSONObject.optString("contentType");
            Intrinsics.i(strOptString3, "jsonObject.optString(CONTENT_TYPE)");
            return new C13629e(strOptString, strOptString2, strOptString3, jSONObject.optInt("timeout", 0));
        }
    }

    public C13629e(String url, String body, String contentType, int i10) {
        Intrinsics.j(url, "url");
        Intrinsics.j(body, "body");
        Intrinsics.j(contentType, "contentType");
        this.url = url;
        this.body = body;
        this.contentType = contentType;
        this.timeout = i10;
    }

    /* renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: b, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final /* synthetic */ int d(int i10) {
        int i11 = this.timeout;
        return i11 > 0 ? i11 : i10;
    }

    public final C5072d e() {
        String string;
        try {
            string = new JSONObject(MapsKt.o(TuplesKt.a("url", this.url), TuplesKt.a("body", this.body), TuplesKt.a("contentType", this.contentType), TuplesKt.a("timeout", Integer.valueOf(this.timeout)))).toString();
        } catch (Exception unused) {
            string = "";
        }
        Intrinsics.i(string, "try {\n            JSONOb…     EMPTY_JSON\n        }");
        return new C5072d(string);
    }
}
