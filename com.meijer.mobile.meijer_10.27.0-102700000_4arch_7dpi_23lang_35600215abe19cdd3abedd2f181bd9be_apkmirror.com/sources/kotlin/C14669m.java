package kotlin;

import android.net.Uri;
import android.os.Bundle;
import com.medallia.digital.mobilesdk.q2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b \u0018\u0000 \u001c2\u00020\u0001:\u0004EIKMB'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b \u0010!JE\u0010&\u001a\u00020\u001b2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b&\u0010'J1\u0010+\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b+\u0010,J3\u0010-\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010/J\u001b\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$00H\u0002¢\u0006\u0004\b1\u00102J#\u00104\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u000103H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u0010/J\u0017\u00108\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b8\u00109J/\u0010:\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0007¢\u0006\u0004\b:\u0010;J/\u0010<\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0000¢\u0006\u0004\b<\u0010;J\u0019\u0010>\u001a\u0002072\b\u0010=\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b>\u0010?J\u001a\u0010A\u001a\u00020\u001b2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u000207H\u0016¢\u0006\u0004\bC\u0010DR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010HR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010HR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010FR\u001d\u0010W\u001a\u0004\u0018\u00010R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010T\u001a\u0004\bX\u0010YR'\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010T\u001a\u0004\b[\u00102R\u0016\u0010^\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010]R/\u0010a\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u0001038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010T\u001a\u0004\b`\u00105R!\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010T\u001a\u0004\bb\u0010cR\u001d\u0010f\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010T\u001a\u0004\be\u0010HR\u001d\u0010h\u001a\u0004\u0018\u00010R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010T\u001a\u0004\bg\u0010VR\u0018\u0010i\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010FR\u001d\u0010k\u001a\u0004\u0018\u00010R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010T\u001a\u0004\bj\u0010VR*\u0010p\u001a\u00020\u001b2\u0006\u0010l\u001a\u00020\u001b8G@@X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010]\u001a\u0004\bm\u0010Y\"\u0004\bn\u0010oR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010c¨\u0006r"}, d2 = {"Li4/m;", "", "", "uriPattern", "action", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "uri", "", "args", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "", "g", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/StringBuilder;)V", "fragment", "Landroid/os/Bundle;", "bundle", "", "Li4/f;", "arguments", "s", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;)V", "Ljava/util/regex/Matcher;", "matcher", "", "q", "(Ljava/util/regex/Matcher;Landroid/os/Bundle;Ljava/util/Map;)Z", "Landroid/net/Uri;", "deepLink", "r", "(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z", "", "inputParams", "Li4/m$d;", "storedParam", "E", "(Ljava/util/List;Li4/m$d;Landroid/os/Bundle;Ljava/util/Map;)Z", "name", "value", "argument", "B", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Li4/f;)Z", "C", "G", "()V", "", "H", "()Ljava/util/Map;", "Lkotlin/Pair;", "D", "()Lkotlin/Pair;", "F", "", "u", "(Ljava/lang/String;)I", "o", "(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;", "p", "requestedLink", "h", "(Landroid/net/Uri;)I", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "b", "i", "c", "t", "d", "Ljava/util/List;", "pathArgs", "e", "pathRegex", "Ljava/util/regex/Pattern;", "f", "Lkotlin/Lazy;", "w", "()Ljava/util/regex/Pattern;", "pathPattern", "A", "()Z", "isParameterizedQuery", "x", "queryArgsMap", "Z", "isSingleQueryParamValueOnly", "j", "l", "fragArgsAndRegex", "k", "()Ljava/util/List;", "fragArgs", "n", "fragRegex", "m", "fragPattern", "mimeTypeRegex", "v", "mimeTypePattern", "<set-?>", "z", "setExactDeepLink$navigation_common_release", "(Z)V", "isExactDeepLink", "argumentsNames", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i4.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14669m {

    /* renamed from: q, reason: collision with root package name */
    private static final b f137325q = new b(null);

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f137326r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: s, reason: collision with root package name */
    private static final Pattern f137327s = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String uriPattern;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String action;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String mimeType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String pathRegex;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy queryArgsMap;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isSingleQueryParamValueOnly;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy fragArgsAndRegex;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy fragArgs;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy fragRegex;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy fragPattern;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String mimeTypeRegex;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy mimeTypePattern;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isExactDeepLink;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> pathArgs = new ArrayList();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy pathPattern = LazyKt.b(new l());

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy isParameterizedQuery = LazyKt.b(new j());

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Li4/m$a;", "", "<init>", "()V", "", "uriPattern", "b", "(Ljava/lang/String;)Li4/m$a;", "Li4/m;", "a", "()Li4/m;", "Ljava/lang/String;", "action", "c", "mimeType", "d", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: i4.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String uriPattern;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String action;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String mimeType;

        public final C14669m a() {
            return new C14669m(this.uriPattern, this.action, this.mimeType);
        }

        public final a b(String uriPattern) {
            Intrinsics.j(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Li4/m$b;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "FILL_IN_PATTERN", "Ljava/util/regex/Pattern;", "SCHEME_PATTERN", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.m$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0012"}, d2 = {"Li4/m$c;", "", "", "mimeType", "<init>", "(Ljava/lang/String;)V", "other", "", "a", "(Li4/m$c;)I", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "setType", "type", "b", "setSubType", "subType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: i4.m$c */
    private static final class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String type;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String subType;

        public c(String mimeType) {
            List listM;
            Intrinsics.j(mimeType, "mimeType");
            List<String> listM2 = new Regex(q2.f92724c).m(mimeType, 0);
            if (listM2.isEmpty()) {
                listM = CollectionsKt.m();
            } else {
                ListIterator<String> listIterator = listM2.listIterator(listM2.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listM = CollectionsKt.b1(listM2, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listM = CollectionsKt.m();
            }
            this.type = (String) listM.get(0);
            this.subType = (String) listM.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c other) {
            Intrinsics.j(other, "other");
            int i10 = Intrinsics.e(this.type, other.type) ? 2 : 0;
            return Intrinsics.e(this.subType, other.subType) ? i10 + 1 : i10;
        }

        /* renamed from: b, reason: from getter */
        public final String getSubType() {
            return this.subType;
        }

        /* renamed from: e, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Li4/m$d;", "", "<init>", "()V", "", "name", "", "a", "(Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "paramRegex", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "arguments", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.m$d */
    private static final class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String paramRegex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<String> arguments = new ArrayList();

        public final void a(String name) {
            Intrinsics.j(name, "name");
            this.arguments.add(name);
        }

        public final List<String> b() {
            return this.arguments;
        }

        /* renamed from: c, reason: from getter */
        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void d(String str) {
            this.paramRegex = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "c", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.m$e */
    static final class e extends Lambda implements Function0<List<String>> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke() {
            List<String> list;
            Pair pairL = C14669m.this.l();
            return (pairL == null || (list = (List) pairL.c()) == null) ? new ArrayList() : list;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Pair;", "", "", "c", "()Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.m$f */
    static final class f extends Lambda implements Function0<Pair<? extends List<String>, ? extends String>> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Pair<List<String>, String> invoke() {
            return C14669m.this.D();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "c", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    /* renamed from: i4.m$g */
    static final class g extends Lambda implements Function0<Pattern> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String strN = C14669m.this.n();
            if (strN != null) {
                return Pattern.compile(strN, 2);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.m$h */
    static final class h extends Lambda implements Function0<String> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Pair pairL = C14669m.this.l();
            if (pairL != null) {
                return (String) pairL.d();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "argName", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.m$i */
    static final class i extends Lambda implements Function1<String, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bundle f137356f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Bundle bundle) {
            super(1);
            this.f137356f = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String argName) {
            Intrinsics.j(argName, "argName");
            return Boolean.valueOf(!this.f137356f.containsKey(argName));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.m$j */
    static final class j extends Lambda implements Function0<Boolean> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((C14669m.this.getUriPattern() == null || Uri.parse(C14669m.this.getUriPattern()).getQuery() == null) ? false : true);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "c", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    /* renamed from: i4.m$k */
    static final class k extends Lambda implements Function0<Pattern> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = C14669m.this.mimeTypeRegex;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "c", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    /* renamed from: i4.m$l */
    static final class l extends Lambda implements Function0<Pattern> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = C14669m.this.pathRegex;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Li4/m$d;", "c", "()Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.m$m, reason: collision with other inner class name */
    static final class C2167m extends Lambda implements Function0<Map<String, d>> {
        C2167m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Map<String, d> invoke() {
            return C14669m.this.H();
        }
    }

    public boolean equals(Object other) {
        if (other != null && (other instanceof C14669m)) {
            C14669m c14669m = (C14669m) other;
            if (Intrinsics.e(this.uriPattern, c14669m.uriPattern) && Intrinsics.e(this.action, c14669m.action) && Intrinsics.e(this.mimeType, c14669m.mimeType)) {
                return true;
            }
        }
        return false;
    }

    private final boolean A() {
        return ((Boolean) this.isParameterizedQuery.getValue()).booleanValue();
    }

    private final boolean B(Bundle bundle, String name, String value, C14662f argument) {
        if (argument == null) {
            bundle.putString(name, value);
            return false;
        }
        argument.a();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<List<String>, String> D() {
        String str = this.uriPattern;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.uriPattern).getFragment();
        StringBuilder sb2 = new StringBuilder();
        Intrinsics.g(fragment);
        g(fragment, arrayList, sb2);
        String string = sb2.toString();
        Intrinsics.i(string, "fragRegex.toString()");
        return TuplesKt.a(arrayList, string);
    }

    private final boolean E(List<String> inputParams, d storedParam, Bundle bundle, Map<String, C14662f> arguments) {
        if (inputParams == null) {
            return true;
        }
        for (String str : inputParams) {
            String paramRegex = storedParam.getParamRegex();
            Matcher matcher = paramRegex != null ? Pattern.compile(paramRegex, 32).matcher(str) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            Bundle bundle2 = new Bundle();
            try {
                List<String> listB = storedParam.b();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
                int i10 = 0;
                for (Object obj : listB) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.w();
                    }
                    String str2 = (String) obj;
                    String strGroup = matcher.group(i11);
                    if (strGroup == null) {
                        strGroup = "";
                    } else {
                        Intrinsics.i(strGroup, "argMatcher.group(index + 1) ?: \"\"");
                    }
                    C14662f c14662f = arguments.get(str2);
                    if (C(bundle, str2, strGroup, c14662f)) {
                        if (!Intrinsics.e(strGroup, '{' + str2 + '}') && B(bundle2, str2, strGroup, c14662f)) {
                            return false;
                        }
                    }
                    arrayList.add(Unit.f142422a);
                    i10 = i11;
                }
                bundle.putAll(bundle2);
            } catch (IllegalArgumentException unused) {
            }
        }
        return true;
    }

    private final void F() {
        if (this.mimeType == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.mimeType).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.mimeType + " does not match to required \"type/subtype\" format").toString());
        }
        c cVar = new c(this.mimeType);
        this.mimeTypeRegex = StringsKt.Q("^(" + cVar.getType() + "|[*]+)/(" + cVar.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    private final void G() {
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("^");
        if (!f137326r.matcher(this.uriPattern).find()) {
            sb2.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.uriPattern);
        matcher.find();
        boolean z10 = false;
        String strSubstring = this.uriPattern.substring(0, matcher.start());
        Intrinsics.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        g(strSubstring, this.pathArgs, sb2);
        if (!StringsKt.c0(sb2, ".*", false, 2, null) && !StringsKt.c0(sb2, "([^/]+?)", false, 2, null)) {
            z10 = true;
        }
        this.isExactDeepLink = z10;
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb2.toString();
        Intrinsics.i(string, "uriRegex.toString()");
        this.pathRegex = StringsKt.Q(string, ".*", "\\E.*\\Q", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, d> H() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (A()) {
            Uri uri = Uri.parse(this.uriPattern);
            for (String paramName : uri.getQueryParameterNames()) {
                StringBuilder sb2 = new StringBuilder();
                List<String> queryParams = uri.getQueryParameters(paramName);
                if (queryParams.size() > 1) {
                    throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.uriPattern + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                Intrinsics.i(queryParams, "queryParams");
                String queryParam = (String) CollectionsKt.u0(queryParams);
                if (queryParam == null) {
                    this.isSingleQueryParamValueOnly = true;
                    queryParam = paramName;
                }
                Matcher matcher = f137327s.matcher(queryParam);
                d dVar = new d();
                int iEnd = 0;
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.h(strGroup, "null cannot be cast to non-null type kotlin.String");
                    dVar.a(strGroup);
                    Intrinsics.i(queryParam, "queryParam");
                    String strSubstring = queryParam.substring(iEnd, matcher.start());
                    Intrinsics.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(Pattern.quote(strSubstring));
                    sb2.append("(.+?)?");
                    iEnd = matcher.end();
                }
                if (iEnd < queryParam.length()) {
                    Intrinsics.i(queryParam, "queryParam");
                    String strSubstring2 = queryParam.substring(iEnd);
                    Intrinsics.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    sb2.append(Pattern.quote(strSubstring2));
                }
                String string = sb2.toString();
                Intrinsics.i(string, "argRegex.toString()");
                dVar.d(StringsKt.Q(string, ".*", "\\E.*\\Q", false, 4, null));
                Intrinsics.i(paramName, "paramName");
                linkedHashMap.put(paramName, dVar);
            }
        }
        return linkedHashMap;
    }

    private final void g(String uri, List<String> args, StringBuilder uriRegex) {
        Matcher matcher = f137327s.matcher(uri);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            Intrinsics.h(strGroup, "null cannot be cast to non-null type kotlin.String");
            args.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = uri.substring(iEnd, matcher.start());
                Intrinsics.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                uriRegex.append(Pattern.quote(strSubstring));
            }
            uriRegex.append("([^/]+?)");
            iEnd = matcher.end();
        }
        if (iEnd < uri.length()) {
            String strSubstring2 = uri.substring(iEnd);
            Intrinsics.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
            uriRegex.append(Pattern.quote(strSubstring2));
        }
    }

    private final List<String> k() {
        return (List) this.fragArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<List<String>, String> l() {
        return (Pair) this.fragArgsAndRegex.getValue();
    }

    private final Pattern m() {
        return (Pattern) this.fragPattern.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        return (String) this.fragRegex.getValue();
    }

    private final boolean q(Matcher matcher, Bundle bundle, Map<String, C14662f> arguments) {
        List<String> list = this.pathArgs;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i11));
            C14662f c14662f = arguments.get(str);
            try {
                Intrinsics.i(value, "value");
                if (B(bundle, str, value, c14662f)) {
                    return false;
                }
                arrayList.add(Unit.f142422a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final Pattern v() {
        return (Pattern) this.mimeTypePattern.getValue();
    }

    private final Pattern w() {
        return (Pattern) this.pathPattern.getValue();
    }

    private final Map<String, d> x() {
        return (Map) this.queryArgsMap.getValue();
    }

    public final int h(Uri requestedLink) {
        if (requestedLink == null || this.uriPattern == null) {
            return 0;
        }
        List<String> requestedPathSegments = requestedLink.getPathSegments();
        List<String> uriPathSegments = Uri.parse(this.uriPattern).getPathSegments();
        Intrinsics.i(requestedPathSegments, "requestedPathSegments");
        Intrinsics.i(uriPathSegments, "uriPathSegments");
        return CollectionsKt.x0(requestedPathSegments, uriPathSegments).size();
    }

    public int hashCode() {
        String str = this.uriPattern;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final List<String> j() {
        List<String> list = this.pathArgs;
        Collection<d> collectionValues = x().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((d) it.next()).b());
        }
        return CollectionsKt.P0(CollectionsKt.P0(list, arrayList), k());
    }

    public final Bundle o(Uri deepLink, Map<String, C14662f> arguments) {
        Intrinsics.j(deepLink, "deepLink");
        Intrinsics.j(arguments, "arguments");
        Pattern patternW = w();
        Matcher matcher = patternW != null ? patternW.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!q(matcher, bundle, arguments)) {
            return null;
        }
        if (A() && !r(deepLink, bundle, arguments)) {
            return null;
        }
        s(deepLink.getFragment(), bundle, arguments);
        if (C14663g.a(arguments, new i(bundle)).isEmpty()) {
            return bundle;
        }
        return null;
    }

    public final Bundle p(Uri deepLink, Map<String, C14662f> arguments) {
        Intrinsics.j(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (deepLink != null) {
            Pattern patternW = w();
            Matcher matcher = patternW != null ? patternW.matcher(deepLink.toString()) : null;
            if (matcher != null && matcher.matches()) {
                q(matcher, bundle, arguments);
                if (A()) {
                    r(deepLink, bundle, arguments);
                }
            }
        }
        return bundle;
    }

    /* renamed from: t, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final int u(String mimeType) {
        Intrinsics.j(mimeType, "mimeType");
        if (this.mimeType == null) {
            return -1;
        }
        Pattern patternV = v();
        Intrinsics.g(patternV);
        if (patternV.matcher(mimeType).matches()) {
            return new c(this.mimeType).compareTo(new c(mimeType));
        }
        return -1;
    }

    /* renamed from: y, reason: from getter */
    public final String getUriPattern() {
        return this.uriPattern;
    }

    /* renamed from: z, reason: from getter */
    public final boolean getIsExactDeepLink() {
        return this.isExactDeepLink;
    }

    public C14669m(String str, String str2, String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f142381c;
        this.queryArgsMap = LazyKt.a(lazyThreadSafetyMode, new C2167m());
        this.fragArgsAndRegex = LazyKt.a(lazyThreadSafetyMode, new f());
        this.fragArgs = LazyKt.a(lazyThreadSafetyMode, new e());
        this.fragRegex = LazyKt.a(lazyThreadSafetyMode, new h());
        this.fragPattern = LazyKt.b(new g());
        this.mimeTypePattern = LazyKt.b(new k());
        G();
        F();
    }

    private final boolean C(Bundle bundle, String name, String value, C14662f argument) {
        if (!bundle.containsKey(name)) {
            return true;
        }
        if (argument == null) {
            return false;
        }
        argument.a();
        throw null;
    }

    private final boolean r(Uri deepLink, Bundle bundle, Map<String, C14662f> arguments) {
        String query;
        for (Map.Entry<String, d> entry : x().entrySet()) {
            String key = entry.getKey();
            d value = entry.getValue();
            List<String> queryParameters = deepLink.getQueryParameters(key);
            if (this.isSingleQueryParamValueOnly && (query = deepLink.getQuery()) != null && !Intrinsics.e(query, deepLink.toString())) {
                queryParameters = CollectionsKt.e(query);
            }
            if (!E(queryParameters, value, bundle, arguments)) {
                return false;
            }
        }
        return true;
    }

    private final void s(String fragment, Bundle bundle, Map<String, C14662f> arguments) {
        Matcher matcher;
        Pattern patternM = m();
        if (patternM != null) {
            matcher = patternM.matcher(String.valueOf(fragment));
        } else {
            matcher = null;
        }
        if (matcher != null && matcher.matches()) {
            List<String> listK = k();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listK, 10));
            int i10 = 0;
            for (Object obj : listK) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.w();
                }
                String str = (String) obj;
                String value = Uri.decode(matcher.group(i11));
                C14662f c14662f = arguments.get(str);
                try {
                    Intrinsics.i(value, "value");
                    if (!B(bundle, str, value, c14662f)) {
                        arrayList.add(Unit.f142422a);
                        i10 = i11;
                    } else {
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }
}
