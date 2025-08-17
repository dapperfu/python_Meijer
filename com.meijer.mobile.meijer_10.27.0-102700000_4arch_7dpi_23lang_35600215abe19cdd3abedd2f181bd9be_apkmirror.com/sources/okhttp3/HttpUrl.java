package okhttp3;

import com.medallia.digital.mobilesdk.q2;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import io.constructor.BuildConfig;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u0000 >2\u00020\u0001:\u0002.1Bc\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028G¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b\u0004\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028G¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b\u0005\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028G¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078G¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010,R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8G¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001e\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00109R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028G¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b\f\u0010\u001eR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010/R\u0011\u0010@\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010A\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b8\u0010\u001eR\u0011\u0010B\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b1\u0010\u001eR\u0011\u0010C\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b2\u0010\u001eR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020\t8G¢\u0006\u0006\u001a\u0004\b3\u0010;R\u0013\u0010E\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b5\u0010\u001eR\u0013\u0010G\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\bF\u0010\u001eR\u0011\u0010I\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bH\u0010,R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00020J8G¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0013\u0010N\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b.\u0010\u001e¨\u0006O"}, d2 = {"Lokhttp3/HttpUrl;", "", "", "scheme", "username", "password", "host", "", "port", "", "pathSegments", "queryNamesAndValues", "fragment", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/net/URL;", "z", "()Ljava/net/URL;", "Ljava/net/URI;", "y", "()Ljava/net/URI;", "name", "t", "(Ljava/lang/String;)Ljava/util/List;", "index", "q", "(I)Ljava/lang/String;", "s", "v", "()Ljava/lang/String;", "link", "w", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "Lokhttp3/HttpUrl$a;", "k", "()Lokhttp3/HttpUrl$a;", "l", "(Ljava/lang/String;)Lokhttp3/HttpUrl$a;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "a", "Ljava/lang/String;", "x", "b", "c", "d", "i", "e", "I", "o", "f", "Ljava/util/List;", "n", "()Ljava/util/List;", "g", "h", "j", "()Z", "isHttps", "encodedUsername", "encodedPassword", "encodedPath", "encodedPathSegments", "encodedQuery", "p", "query", "u", "querySize", "", "r", "()Ljava/util/Set;", "queryParameterNames", "encodedFragment", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class HttpUrl {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String scheme;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String username;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String password;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String host;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int port;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<String> pathSegments;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<String> queryNamesAndValues;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String fragment;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String url;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00040\u00112\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u0003J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\"J\u001b\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040$*\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b)\u0010(J'\u0010*\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010(J'\u0010+\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010(J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0004\b0\u0010.J\u0015\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0004¢\u0006\u0004\b2\u0010.J\u0015\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b4\u0010.J\u0015\u00106\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u000e¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0004¢\u0006\u0004\b9\u0010.J\u0015\u0010:\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b:\u0010.J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0004\b<\u0010.J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u000e¢\u0006\u0004\b>\u00107J\u0015\u0010@\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0004¢\u0006\u0004\b@\u0010.J\u0017\u0010B\u001a\u00020\u00002\b\u0010A\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bB\u0010.J\u0017\u0010D\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bD\u0010.J\u001f\u0010G\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00042\b\u0010F\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bG\u0010HJ\u001f\u0010K\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u00042\b\u0010J\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bK\u0010HJ\u001f\u0010L\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00042\b\u0010F\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bL\u0010HJ\u0015\u0010M\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0004¢\u0006\u0004\bM\u0010.J\u0017\u0010O\u001a\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bO\u0010.J\u0017\u0010Q\u001a\u00020\u00002\b\u0010P\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bQ\u0010.J\u000f\u0010R\u001a\u00020\u0000H\u0000¢\u0006\u0004\bR\u0010SJ\r\u0010U\u001a\u00020T¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0004H\u0016¢\u0006\u0004\bW\u0010XJ!\u0010Z\u001a\u00020\u00002\b\u0010Y\u001a\u0004\u0018\u00010T2\u0006\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0004\bZ\u0010[R$\u0010,\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010\\\u001a\u0004\b]\u0010X\"\u0004\b^\u0010\rR\"\u0010a\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010\\\u001a\u0004\b_\u0010X\"\u0004\b`\u0010\rR\"\u0010d\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010\\\u001a\u0004\bb\u0010X\"\u0004\bc\u0010\rR$\u00103\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010\\\u001a\u0004\be\u0010X\"\u0004\bf\u0010\rR\"\u00105\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010f\u001a\u0004\bg\u0010\u0010\"\u0004\bh\u0010iR \u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010j\u001a\u0004\bk\u0010lR,\u0010p\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010j\u001a\u0004\bm\u0010l\"\u0004\bn\u0010oR$\u0010P\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\\\u001a\u0004\bq\u0010X\"\u0004\br\u0010\r¨\u0006s"}, d2 = {"Lokhttp3/HttpUrl$a;", "", "<init>", "()V", "", "pathSegments", "", "alreadyEncoded", "e", "(Ljava/lang/String;Z)Lokhttp3/HttpUrl$a;", "canonicalName", "", "z", "(Ljava/lang/String;)V", "", "h", "()I", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "N", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "input", "startPos", "limit", "C", "(Ljava/lang/String;II)V", "pos", "addTrailingSlash", "w", "(Ljava/lang/String;IIZZ)V", "t", "o", "(Ljava/lang/String;)Z", "p", "", "O", "(Ljava/lang/String;)Ljava/util/List;", "E", "(Ljava/lang/String;II)I", "M", "v", "r", "scheme", "D", "(Ljava/lang/String;)Lokhttp3/HttpUrl$a;", "username", "P", "password", "s", "host", "n", "port", "u", "(I)Lokhttp3/HttpUrl$a;", "pathSegment", "c", "d", "encodedPathSegments", "a", "index", "B", "encodedPath", "j", "query", "x", "encodedQuery", "k", "name", "value", "f", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$a;", "encodedName", "encodedValue", "b", "K", "A", "fragment", "l", "encodedFragment", "i", "y", "()Lokhttp3/HttpUrl$a;", "Lokhttp3/HttpUrl;", "g", "()Lokhttp3/HttpUrl;", "toString", "()Ljava/lang/String;", "base", "q", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$a;", "Ljava/lang/String;", "getScheme$okhttp", "L", "getEncodedUsername$okhttp", "H", "encodedUsername", "getEncodedPassword$okhttp", "G", "encodedPassword", "getHost$okhttp", "I", "getPort$okhttp", "J", "(I)V", "Ljava/util/List;", "m", "()Ljava/util/List;", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "getEncodedFragment$okhttp", "F", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String scheme;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String host;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private List<String> encodedQueryNamesAndValues;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private String encodedFragment;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String encodedUsername = "";

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String encodedPassword = "";

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int port = -1;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<String> encodedPathSegments = CollectionsKt.s("");

        private final int M(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '/' && cCharAt != '\\') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        private final a e(String pathSegments, boolean alreadyEncoded) {
            boolean z10;
            a aVar;
            String str;
            boolean z11;
            int i10 = 0;
            while (true) {
                int iK = Rv.h.k(pathSegments, "/\\", i10, pathSegments.length());
                if (iK < pathSegments.length()) {
                    z10 = true;
                    str = pathSegments;
                    z11 = alreadyEncoded;
                    aVar = this;
                } else {
                    z10 = false;
                    aVar = this;
                    str = pathSegments;
                    z11 = alreadyEncoded;
                }
                aVar.w(str, i10, iK, z10, z11);
                i10 = iK + 1;
                if (i10 > str.length()) {
                    return aVar;
                }
                pathSegments = str;
                alreadyEncoded = z11;
            }
        }

        private final int r(String input, int pos, int limit) throws NumberFormatException {
            int i10;
            try {
                i10 = Integer.parseInt(gw.a.b(input, pos, limit, "", false, false, false, false, BinsView.TOTE_HEIGHT_DP, null));
            } catch (NumberFormatException unused) {
            }
            if (1 > i10 || i10 >= 65536) {
                return -1;
            }
            return i10;
        }

        public final a u(int port) {
            if (1 <= port && port < 65536) {
                this.port = port;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + port).toString());
        }

        private final void C(String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char cCharAt = input.charAt(startPos);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                startPos++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            int i10 = startPos;
            while (i10 < limit) {
                int iK = Rv.h.k(input, "/\\", i10, limit);
                boolean z10 = iK < limit;
                String str = input;
                w(str, i10, iK, z10, true);
                if (z10) {
                    i10 = iK + 1;
                    input = str;
                } else {
                    input = str;
                    i10 = iK;
                }
            }
        }

        private final int E(String input, int pos, int limit) {
            if (limit - pos < 2) {
                return -1;
            }
            char cCharAt = input.charAt(pos);
            if ((Intrinsics.k(cCharAt, 97) >= 0 && Intrinsics.k(cCharAt, 122) <= 0) || (Intrinsics.k(cCharAt, 65) >= 0 && Intrinsics.k(cCharAt, 90) <= 0)) {
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        break;
                    }
                    char cCharAt2 = input.charAt(pos);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return pos;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private final List<String> O(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iO0 = StringsKt.o0(str2, '&', i10, false, 4, null);
                if (iO0 == -1) {
                    iO0 = str2.length();
                }
                int iO02 = StringsKt.o0(str2, '=', i10, false, 4, null);
                if (iO02 == -1 || iO02 > iO0) {
                    String strSubstring = str2.substring(i10, iO0);
                    Intrinsics.i(strSubstring, "substring(...)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iO02);
                    Intrinsics.i(strSubstring2, "substring(...)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iO02 + 1, iO0);
                    Intrinsics.i(strSubstring3, "substring(...)");
                    arrayList.add(strSubstring3);
                }
                i10 = iO0 + 1;
                str = str2;
            }
            return arrayList;
        }

        private final int h() {
            int i10 = this.port;
            if (i10 != -1) {
                return i10;
            }
            Companion companion = HttpUrl.INSTANCE;
            String str = this.scheme;
            Intrinsics.g(str);
            return companion.b(str);
        }

        private final boolean o(String input) {
            return Intrinsics.e(input, ".") || StringsKt.H(input, "%2e", true);
        }

        private final boolean p(String input) {
            return Intrinsics.e(input, "..") || StringsKt.H(input, "%2e.", true) || StringsKt.H(input, ".%2e", true) || StringsKt.H(input, "%2e%2e", true);
        }

        private final void t() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                this.encodedPathSegments.set(r0.size() - 1, "");
            }
        }

        private final int v(String input, int pos, int limit) {
            while (pos < limit) {
                char cCharAt = input.charAt(pos);
                if (cCharAt == ':') {
                    return pos;
                }
                if (cCharAt == '[') {
                    do {
                        pos++;
                        if (pos < limit) {
                        }
                    } while (input.charAt(pos) != ']');
                }
                pos++;
            }
            return limit;
        }

        private final void w(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String strB = gw.a.b(input, pos, limit, " \"<>^`{}|/\\?#", alreadyEncoded, false, false, false, 112, null);
            if (o(strB)) {
                return;
            }
            if (p(strB)) {
                t();
                return;
            }
            if (this.encodedPathSegments.get(r12.size() - 1).length() == 0) {
                this.encodedPathSegments.set(r12.size() - 1, strB);
            } else {
                this.encodedPathSegments.add(strB);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add("");
            }
        }

        private final void z(String canonicalName) {
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.g(list);
            int size = list.size() - 2;
            int iC = ProgressionUtilKt.c(size, 0, -2);
            if (iC > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                Intrinsics.g(list2);
                if (Intrinsics.e(canonicalName, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    Intrinsics.g(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    Intrinsics.g(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    Intrinsics.g(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == iC) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        public final a A(String name) {
            Intrinsics.j(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            z(gw.a.b(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 91, null));
            return this;
        }

        public final a B(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final a D(String scheme) {
            Intrinsics.j(scheme, "scheme");
            if (StringsKt.H(scheme, "http", true)) {
                this.scheme = "http";
                return this;
            }
            if (StringsKt.H(scheme, BuildConfig.SERVICE_SCHEME, true)) {
                this.scheme = BuildConfig.SERVICE_SCHEME;
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public final void F(String str) {
            this.encodedFragment = str;
        }

        public final void G(String str) {
            Intrinsics.j(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final void H(String str) {
            Intrinsics.j(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void I(String str) {
            this.host = str;
        }

        public final void J(int i10) {
            this.port = i10;
        }

        public final a K(String name, String value) {
            Intrinsics.j(name, "name");
            A(name);
            f(name, value);
            return this;
        }

        public final void L(String str) {
            this.scheme = str;
        }

        public final a P(String username) {
            Intrinsics.j(username, "username");
            this.encodedUsername = gw.a.b(username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        public final a a(String encodedPathSegments) {
            Intrinsics.j(encodedPathSegments, "encodedPathSegments");
            return e(encodedPathSegments, true);
        }

        public final a b(String encodedName, String encodedValue) {
            Intrinsics.j(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.g(list);
            list.add(gw.a.b(encodedName, 0, 0, " \"'<>#&=", true, false, true, false, 83, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.g(list2);
            list2.add(encodedValue != null ? gw.a.b(encodedValue, 0, 0, " \"'<>#&=", true, false, true, false, 83, null) : null);
            return this;
        }

        public final a c(String pathSegment) {
            Intrinsics.j(pathSegment, "pathSegment");
            w(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final a d(String pathSegments) {
            Intrinsics.j(pathSegments, "pathSegments");
            return e(pathSegments, false);
        }

        public final a f(String name, String value) {
            Intrinsics.j(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.g(list);
            list.add(gw.a.b(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 91, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.g(list2);
            list2.add(value != null ? gw.a.b(value, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 91, null) : null);
            return this;
        }

        public final HttpUrl g() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strG = gw.a.g(this.encodedUsername, 0, 0, false, 7, null);
            String strG2 = gw.a.g(this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iH = h();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(gw.a.g((String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.x(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? gw.a.g(str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strG, strG2, str2, iH, arrayList2, arrayList, str4 != null ? gw.a.g(str4, 0, 0, false, 7, null) : null, toString(), null);
        }

        public final a i(String encodedFragment) {
            this.encodedFragment = encodedFragment != null ? gw.a.b(encodedFragment, 0, 0, "", true, false, false, true, 51, null) : null;
            return this;
        }

        public final a j(String encodedPath) {
            Intrinsics.j(encodedPath, "encodedPath");
            if (StringsKt.W(encodedPath, q2.f92724c, false, 2, null)) {
                C(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
        }

        public final a k(String encodedQuery) {
            String strB;
            this.encodedQueryNamesAndValues = (encodedQuery == null || (strB = gw.a.b(encodedQuery, 0, 0, " \"'<>#", true, false, true, false, 83, null)) == null) ? null : O(strB);
            return this;
        }

        public final a l(String fragment) {
            this.encodedFragment = fragment != null ? gw.a.b(fragment, 0, 0, "", false, false, false, true, 59, null) : null;
            return this;
        }

        public final List<String> m() {
            return this.encodedPathSegments;
        }

        public final a n(String host) {
            Intrinsics.j(host, "host");
            String strK = Rv.f.k(gw.a.g(host, 0, 0, false, 7, null));
            if (strK != null) {
                this.host = strK;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final a q(HttpUrl base, String input) throws NumberFormatException {
            int iK;
            boolean z10;
            int i10;
            int i11;
            char c10;
            String input2 = input;
            Intrinsics.j(input2, "input");
            int iR = Rv.h.r(input2, 0, 0, 3, null);
            int iT = Rv.h.t(input2, iR, 0, 2, null);
            int iE = E(input2, iR, iT);
            boolean z11 = true;
            if (iE != -1) {
                if (StringsKt.T(input2, "https:", iR, true)) {
                    this.scheme = BuildConfig.SERVICE_SCHEME;
                    iR += 6;
                } else {
                    if (!StringsKt.T(input2, "http:", iR, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input2.substring(0, iE);
                        Intrinsics.i(strSubstring, "substring(...)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.scheme = "http";
                    iR += 5;
                }
            } else {
                if (base == null) {
                    if (input2.length() > 6) {
                        input2 = StringsKt.J1(input2, 6) + "...";
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + input2);
                }
                this.scheme = base.getScheme();
            }
            int iM = M(input2, iR, iT);
            char c11 = '?';
            char c12 = '#';
            if (iM >= 2 || base == null || !Intrinsics.e(base.getScheme(), this.scheme)) {
                boolean z12 = false;
                boolean z13 = false;
                int i12 = iR + iM;
                while (true) {
                    iK = Rv.h.k(input2, "@/\\?#", i12, iT);
                    char cCharAt = iK != iT ? input2.charAt(iK) : (char) 65535;
                    if (cCharAt == 65535 || cCharAt == c12 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c11) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z12) {
                            z10 = z11;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.encodedPassword);
                            sb3.append("%40");
                            input2 = input;
                            i10 = iK;
                            sb3.append(gw.a.b(input2, i12, iK, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null));
                            this.encodedPassword = sb3.toString();
                        } else {
                            int iJ = Rv.h.j(input2, ':', i12, iK);
                            z10 = z11;
                            String strB = gw.a.b(input2, i12, iJ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                            if (z13) {
                                strB = this.encodedUsername + "%40" + strB;
                            }
                            this.encodedUsername = strB;
                            if (iJ != iK) {
                                i11 = iK;
                                this.encodedPassword = gw.a.b(input, iJ + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                                z12 = z10;
                            } else {
                                i11 = iK;
                            }
                            input2 = input;
                            i10 = i11;
                            z13 = z10;
                        }
                        i12 = i10 + 1;
                        z11 = z10;
                        c12 = '#';
                        c11 = '?';
                    }
                }
                int iV = v(input2, i12, iK);
                int i13 = iV + 1;
                if (i13 < iK) {
                    this.host = Rv.f.k(gw.a.g(input2, i12, iV, false, 4, null));
                    int iR2 = r(input2, i13, iK);
                    this.port = iR2;
                    if (iR2 == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = input2.substring(i13, iK);
                        Intrinsics.i(strSubstring2, "substring(...)");
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    this.host = Rv.f.k(gw.a.g(input2, i12, iV, false, 4, null));
                    Companion companion = HttpUrl.INSTANCE;
                    String str = this.scheme;
                    Intrinsics.g(str);
                    this.port = companion.b(str);
                }
                if (this.host == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = input2.substring(i12, iV);
                    Intrinsics.i(strSubstring3, "substring(...)");
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iR = iK;
            } else {
                this.encodedUsername = base.f();
                this.encodedPassword = base.b();
                this.host = base.getHost();
                this.port = base.getPort();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.d());
                if (iR == iT || input2.charAt(iR) == '#') {
                    k(base.e());
                }
            }
            int iK2 = Rv.h.k(input2, "?#", iR, iT);
            C(input2, iR, iK2);
            if (iK2 >= iT || input2.charAt(iK2) != '?') {
                c10 = '#';
            } else {
                c10 = '#';
                int iJ2 = Rv.h.j(input2, '#', iK2, iT);
                this.encodedQueryNamesAndValues = O(gw.a.b(input2, iK2 + 1, iJ2, " \"'<>#", true, false, true, false, 80, null));
                iK2 = iJ2;
            }
            if (iK2 < iT && input2.charAt(iK2) == c10) {
                this.encodedFragment = gw.a.b(input2, iK2 + 1, iT, "", true, false, false, true, 48, null);
            }
            return this;
        }

        public final a s(String password) {
            Intrinsics.j(password, "password");
            this.encodedPassword = gw.a.b(password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L69
                kotlin.jvm.internal.Intrinsics.g(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = kotlin.text.StringsKt.b0(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L69:
                int r1 = r6.port
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.h()
                java.lang.String r3 = r6.scheme
                if (r3 == 0) goto L85
                okhttp3.HttpUrl$b r4 = okhttp3.HttpUrl.INSTANCE
                kotlin.jvm.internal.Intrinsics.g(r3)
                int r3 = r4.b(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                java.util.List<java.lang.String> r1 = r6.encodedPathSegments
                r6.N(r1, r0)
                java.util.List<java.lang.String> r1 = r6.encodedQueryNamesAndValues
                if (r1 == 0) goto La3
                r1 = 63
                r0.append(r1)
                okhttp3.HttpUrl$b r1 = okhttp3.HttpUrl.INSTANCE
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.g(r2)
                okhttp3.HttpUrl.Companion.a(r1, r2, r0)
            La3:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.a.toString():java.lang.String");
        }

        public final a x(String query) {
            String strB;
            this.encodedQueryNamesAndValues = (query == null || (strB = gw.a.b(query, 0, 0, " \"'<>#", false, false, true, false, 91, null)) == null) ? null : O(strB);
            return this;
        }

        public final a y() {
            String str = this.host;
            this.host = str != null ? new Regex("[\"<>^`{|}]").k(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<String> list = this.encodedPathSegments;
                list.set(i10, gw.a.b(list.get(i10), 0, 0, "[]", true, true, false, false, 99, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = list2.get(i11);
                    list2.set(i11, str2 != null ? gw.a.b(str2, 0, 0, "\\^`{|}", true, true, true, false, 67, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? gw.a.b(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 35, null) : null;
            return this;
        }

        private final void N(List<String> list, StringBuilder sb2) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append(list.get(i10));
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0010*\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/HttpUrl$b;", "", "<init>", "()V", "", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "", "f", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "scheme", "", "b", "(Ljava/lang/String;)I", "Lokhttp3/HttpUrl;", "c", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "e", "Ljava/net/URI;", "d", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: okhttp3.HttpUrl$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(List<String> list, StringBuilder sb2) {
            IntProgression intProgressionW = RangesKt.w(RangesKt.x(0, list.size()), 2);
            int iF = intProgressionW.getFirst();
            int iH = intProgressionW.getLast();
            int iK = intProgressionW.getStep();
            if ((iK <= 0 || iF > iH) && (iK >= 0 || iH > iF)) {
                return;
            }
            while (true) {
                String str = list.get(iF);
                String str2 = list.get(iF + 1);
                if (iF > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (iF == iH) {
                    return;
                } else {
                    iF += iK;
                }
            }
        }

        private Companion() {
        }

        @JvmStatic
        public final int b(String scheme) {
            Intrinsics.j(scheme, "scheme");
            if (Intrinsics.e(scheme, "http")) {
                return 80;
            }
            return Intrinsics.e(scheme, BuildConfig.SERVICE_SCHEME) ? 443 : -1;
        }

        @JvmStatic
        @JvmName
        public final HttpUrl c(String str) {
            Intrinsics.j(str, "<this>");
            return new a().q(null, str).g();
        }

        @JvmStatic
        @JvmName
        public final HttpUrl d(URI uri) {
            Intrinsics.j(uri, "<this>");
            String string = uri.toString();
            Intrinsics.i(string, "toString(...)");
            return e(string);
        }

        @JvmStatic
        @JvmName
        public final HttpUrl e(String str) {
            Intrinsics.j(str, "<this>");
            try {
                return c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public /* synthetic */ HttpUrl(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i10, list, list2, str5, str6);
    }

    @JvmStatic
    @JvmName
    public static final HttpUrl g(String str) {
        return INSTANCE.c(str);
    }

    @JvmStatic
    @JvmName
    public static final HttpUrl h(URI uri) {
        return INSTANCE.d(uri);
    }

    @JvmStatic
    @JvmName
    public static final HttpUrl m(String str) {
        return INSTANCE.e(str);
    }

    private HttpUrl(String str, String str2, String str3, String str4, int i10, List<String> list, List<String> list2, String str5, String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i10;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
    }

    @JvmName
    public final String a() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(StringsKt.o0(this.url, '#', 0, false, 6, null) + 1);
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    @JvmName
    public final String b() {
        if (this.password.length() == 0) {
            return "";
        }
        String strSubstring = this.url.substring(StringsKt.o0(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1, StringsKt.o0(this.url, '@', 0, false, 6, null));
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    @JvmName
    public final String c() {
        int iO0 = StringsKt.o0(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        String strSubstring = this.url.substring(iO0, Rv.h.k(str, "?#", iO0, str.length()));
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    @JvmName
    public final List<String> d() {
        int iO0 = StringsKt.o0(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iK = Rv.h.k(str, "?#", iO0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iO0 < iK) {
            int i10 = iO0 + 1;
            int iJ = Rv.h.j(this.url, '/', i10, iK);
            String strSubstring = this.url.substring(i10, iJ);
            Intrinsics.i(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iO0 = iJ;
        }
        return arrayList;
    }

    @JvmName
    public final String e() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iO0 = StringsKt.o0(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iO0, Rv.h.j(str, '#', iO0, str.length()));
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public boolean equals(Object other) {
        return (other instanceof HttpUrl) && Intrinsics.e(((HttpUrl) other).url, this.url);
    }

    @JvmName
    public final String f() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, Rv.h.k(str, ":@", length, str.length()));
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @JvmName
    /* renamed from: i, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    public final boolean j() {
        return Intrinsics.e(this.scheme, BuildConfig.SERVICE_SCHEME);
    }

    public final a k() {
        a aVar = new a();
        aVar.L(this.scheme);
        aVar.H(f());
        aVar.G(b());
        aVar.I(this.host);
        aVar.J(this.port != INSTANCE.b(this.scheme) ? this.port : -1);
        aVar.m().clear();
        aVar.m().addAll(d());
        aVar.k(e());
        aVar.F(a());
        return aVar;
    }

    public final a l(String link) {
        Intrinsics.j(link, "link");
        try {
            return new a().q(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @JvmName
    public final List<String> n() {
        return this.pathSegments;
    }

    @JvmName
    /* renamed from: o, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    @JvmName
    public final String p() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        INSTANCE.f(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    public final String q(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(index * 2);
        Intrinsics.g(str);
        return str;
    }

    @JvmName
    public final Set<String> r() {
        if (this.queryNamesAndValues == null) {
            return SetsKt.e();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.queryNamesAndValues.size() / 2, 1.0f);
        IntProgression intProgressionW = RangesKt.w(RangesKt.x(0, this.queryNamesAndValues.size()), 2);
        int iF = intProgressionW.getFirst();
        int iH = intProgressionW.getLast();
        int iK = intProgressionW.getStep();
        if ((iK > 0 && iF <= iH) || (iK < 0 && iH <= iF)) {
            while (true) {
                String str = this.queryNamesAndValues.get(iF);
                Intrinsics.g(str);
                linkedHashSet.add(str);
                if (iF == iH) {
                    break;
                }
                iF += iK;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.i(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public final String s(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> t(String name) {
        Intrinsics.j(name, "name");
        if (this.queryNamesAndValues == null) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList(4);
        IntProgression intProgressionW = RangesKt.w(RangesKt.x(0, this.queryNamesAndValues.size()), 2);
        int iF = intProgressionW.getFirst();
        int iH = intProgressionW.getLast();
        int iK = intProgressionW.getStep();
        if ((iK > 0 && iF <= iH) || (iK < 0 && iH <= iF)) {
            while (true) {
                if (Intrinsics.e(name, this.queryNamesAndValues.get(iF))) {
                    arrayList.add(this.queryNamesAndValues.get(iF + 1));
                }
                if (iF == iH) {
                    break;
                }
                iF += iK;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.i(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    /* renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @JvmName
    public final int u() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String v() {
        a aVarL = l("/...");
        Intrinsics.g(aVarL);
        return aVarL.P("").s("").g().getUrl();
    }

    public final HttpUrl w(String link) {
        Intrinsics.j(link, "link");
        a aVarL = l(link);
        if (aVarL != null) {
            return aVarL.g();
        }
        return null;
    }

    @JvmName
    /* renamed from: x, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @JvmName
    public final URL z() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    @JvmName
    public final URI y() {
        String string = k().y().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").k(string, ""));
                Intrinsics.g(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }
}
