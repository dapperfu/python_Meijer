package k6;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lk6/m;", "", "a", "b", "c", "d", "e", "f", "Lk6/m$a;", "Lk6/m$b;", "Lk6/m$c;", "Lk6/m$d;", "Lk6/m$e;", "Lk6/m$f;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k6.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC15110m {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lk6/m$a;", "Lk6/m;", "", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;)I", "", "other", "", "a", "(Ljava/lang/String;Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAssetName", "()Ljava/lang/String;", "assetName", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    /* renamed from: k6.m$a */
    public static final class a implements InterfaceC15110m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String assetName;

        public static boolean a(String str, Object obj) {
            return (obj instanceof a) && Intrinsics.e(str, ((a) obj).getAssetName());
        }

        public static String c(String str) {
            return "Asset(assetName=" + str + ")";
        }

        /* renamed from: d, reason: from getter */
        public final /* synthetic */ String getAssetName() {
            return this.assetName;
        }

        public boolean equals(Object obj) {
            return a(this.assetName, obj);
        }

        public int hashCode() {
            return b(this.assetName);
        }

        public String toString() {
            return c(this.assetName);
        }

        public static int b(String str) {
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\r¨\u0006\u0012"}, d2 = {"Lk6/m$b;", "Lk6/m;", "", "c", "(Landroid/net/Uri;)Ljava/lang/String;", "", "b", "(Landroid/net/Uri;)I", "", "other", "", "a", "(Landroid/net/Uri;Ljava/lang/Object;)Z", "Landroid/net/Uri;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    /* renamed from: k6.m$b */
    public static final class b implements InterfaceC15110m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Uri uri;

        public static boolean a(Uri uri, Object obj) {
            return (obj instanceof b) && Intrinsics.e(uri, ((b) obj).getUri());
        }

        public static String c(Uri uri) {
            return "ContentProvider(uri=" + uri + ")";
        }

        /* renamed from: d, reason: from getter */
        public final /* synthetic */ Uri getUri() {
            return this.uri;
        }

        public boolean equals(Object obj) {
            return a(this.uri, obj);
        }

        public int hashCode() {
            return b(this.uri);
        }

        public String toString() {
            return c(this.uri);
        }

        public static int b(Uri uri) {
            return uri.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lk6/m$c;", "Lk6/m;", "", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;)I", "", "other", "", "a", "(Ljava/lang/String;Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "fileName", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    /* renamed from: k6.m$c */
    public static final class c implements InterfaceC15110m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String fileName;

        public static boolean a(String str, Object obj) {
            return (obj instanceof c) && Intrinsics.e(str, ((c) obj).getFileName());
        }

        public static String c(String str) {
            return "File(fileName=" + str + ")";
        }

        /* renamed from: d, reason: from getter */
        public final /* synthetic */ String getFileName() {
            return this.fileName;
        }

        public boolean equals(Object obj) {
            return a(this.fileName, obj);
        }

        public int hashCode() {
            return b(this.fileName);
        }

        public String toString() {
            return c(this.fileName);
        }

        public static int b(String str) {
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lk6/m$d;", "Lk6/m;", "", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;)I", "", "other", "", "a", "(Ljava/lang/String;Ljava/lang/Object;)Z", "Ljava/lang/String;", "getJsonString", "()Ljava/lang/String;", "jsonString", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    /* renamed from: k6.m$d */
    public static final class d implements InterfaceC15110m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String jsonString;

        public static boolean a(String str, Object obj) {
            return (obj instanceof d) && Intrinsics.e(str, ((d) obj).getJsonString());
        }

        public static String c(String str) {
            return "JsonString(jsonString=" + str + ")";
        }

        /* renamed from: d, reason: from getter */
        public final /* synthetic */ String getJsonString() {
            return this.jsonString;
        }

        public boolean equals(Object obj) {
            return a(this.jsonString, obj);
        }

        public int hashCode() {
            return b(this.jsonString);
        }

        public String toString() {
            return c(this.jsonString);
        }

        public static int b(String str) {
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lk6/m$e;", "Lk6/m;", "", "resId", "b", "(I)I", "", "f", "(I)Ljava/lang/String;", "e", "", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "getResId", "()I", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    /* renamed from: k6.m$e */
    public static final class e implements InterfaceC15110m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int resId;

        public static int b(int i10) {
            return i10;
        }

        public static final /* synthetic */ e a(int i10) {
            return new e(i10);
        }

        public static boolean c(int i10, Object obj) {
            return (obj instanceof e) && i10 == ((e) obj).getResId();
        }

        public static final boolean d(int i10, int i11) {
            return i10 == i11;
        }

        public static String f(int i10) {
            return "RawRes(resId=" + i10 + ")";
        }

        public boolean equals(Object obj) {
            return c(this.resId, obj);
        }

        /* renamed from: g, reason: from getter */
        public final /* synthetic */ int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return e(this.resId);
        }

        public String toString() {
            return f(this.resId);
        }

        private /* synthetic */ e(int i10) {
            this.resId = i10;
        }

        public static int e(int i10) {
            return Integer.hashCode(i10);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lk6/m$f;", "Lk6/m;", "", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;)I", "", "other", "", "a", "(Ljava/lang/String;Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    /* renamed from: k6.m$f */
    public static final class f implements InterfaceC15110m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String url;

        public static boolean a(String str, Object obj) {
            return (obj instanceof f) && Intrinsics.e(str, ((f) obj).getUrl());
        }

        public static String c(String str) {
            return "Url(url=" + str + ")";
        }

        /* renamed from: d, reason: from getter */
        public final /* synthetic */ String getUrl() {
            return this.url;
        }

        public boolean equals(Object obj) {
            return a(this.url, obj);
        }

        public int hashCode() {
            return b(this.url);
        }

        public String toString() {
            return c(this.url);
        }

        public static int b(String str) {
            return str.hashCode();
        }
    }
}
