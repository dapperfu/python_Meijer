package Fr;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LFr/d;", "", "<init>", "()V", "d", "a", "c", "b", "LFr/d$a;", "LFr/d$b;", "LFr/d$c;", "LFr/d$d;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class d {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"LFr/d$a;", "LFr/d;", "", "data", "baseUrl", "encoding", "mimeType", "historyUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fr.d$a, reason: from toString */
    public static final /* data */ class Data extends d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String data;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String baseUrl;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String encoding;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mimeType;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String historyUrl;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.e(this.data, data.data) && Intrinsics.e(this.baseUrl, data.baseUrl) && Intrinsics.e(this.encoding, data.encoding) && Intrinsics.e(this.mimeType, data.mimeType) && Intrinsics.e(this.historyUrl, data.historyUrl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Data(String data, String str, String encoding, String str2, String str3) {
            super(null);
            Intrinsics.j(data, "data");
            Intrinsics.j(encoding, "encoding");
            this.data = data;
            this.baseUrl = str;
            this.encoding = encoding;
            this.mimeType = str2;
            this.historyUrl = str3;
        }

        /* renamed from: a, reason: from getter */
        public final String getBaseUrl() {
            return this.baseUrl;
        }

        /* renamed from: b, reason: from getter */
        public final String getData() {
            return this.data;
        }

        /* renamed from: c, reason: from getter */
        public final String getEncoding() {
            return this.encoding;
        }

        /* renamed from: d, reason: from getter */
        public final String getHistoryUrl() {
            return this.historyUrl;
        }

        /* renamed from: e, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        public int hashCode() {
            int iHashCode = this.data.hashCode() * 31;
            String str = this.baseUrl;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.encoding.hashCode()) * 31;
            String str2 = this.mimeType;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.historyUrl;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Data(data=" + this.data + ", baseUrl=" + this.baseUrl + ", encoding=" + this.encoding + ", mimeType=" + this.mimeType + ", historyUrl=" + this.historyUrl + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFr/d$b;", "LFr/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f10981a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public String toString() {
            return "NavigatorOnly";
        }

        public int hashCode() {
            return -389480379;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"LFr/d$c;", "LFr/d;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "url", "", "[B", "()[B", "postData", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fr.d$c, reason: from toString */
    public static final /* data */ class Post extends d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final byte[] postData;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.e(Post.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.h(other, "null cannot be cast to non-null type com.meijer.mobile.ui.common.compose.webview.WebContent.Post");
            Post post = (Post) other;
            return Intrinsics.e(this.url, post.url) && Arrays.equals(this.postData, post.postData);
        }

        /* renamed from: a, reason: from getter */
        public final byte[] getPostData() {
            return this.postData;
        }

        /* renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + Arrays.hashCode(this.postData);
        }

        public String toString() {
            return "Post(url=" + this.url + ", postData=" + Arrays.toString(this.postData) + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LFr/d$d;", "LFr/d;", "", "url", "", "additionalHttpHeaders", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fr.d$d, reason: collision with other inner class name and from toString */
    public static final /* data */ class Url extends d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, String> additionalHttpHeaders;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Url)) {
                return false;
            }
            Url url = (Url) other;
            return Intrinsics.e(this.url, url.url) && Intrinsics.e(this.additionalHttpHeaders, url.additionalHttpHeaders);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Url(String url, Map<String, String> additionalHttpHeaders) {
            super(null);
            Intrinsics.j(url, "url");
            Intrinsics.j(additionalHttpHeaders, "additionalHttpHeaders");
            this.url = url;
            this.additionalHttpHeaders = additionalHttpHeaders;
        }

        public final Map<String, String> a() {
            return this.additionalHttpHeaders;
        }

        /* renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.additionalHttpHeaders.hashCode();
        }

        public String toString() {
            return "Url(url=" + this.url + ", additionalHttpHeaders=" + this.additionalHttpHeaders + ')';
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}
