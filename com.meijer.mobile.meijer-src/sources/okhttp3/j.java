package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \"2\u00020\u0001:\u0001\u001aB/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lokhttp3/j;", "", "", "mediaType", "type", "subtype", "", "parameterNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "Ljava/nio/charset/Charset;", "defaultValue", "c", "(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "name", "f", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getMediaType$okhttp", "b", "i", "h", "d", "[Ljava/lang/String;", "e", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Regex f154703f = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: g, reason: collision with root package name */
    private static final Regex f154704g = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String mediaType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String subtype;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String[] parameterNamesAndValues;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lokhttp3/j$a;", "", "<init>", "()V", "", "Lokhttp3/j;", "a", "(Ljava/lang/String;)Lokhttp3/j;", "b", "TOKEN", "Ljava/lang/String;", "QUOTED", "Lkotlin/text/Regex;", "TYPE_SUBTYPE", "Lkotlin/text/Regex;", "PARAMETER", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: okhttp3.j$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @JvmName
        public final j a(String str) {
            Intrinsics.j(str, "<this>");
            MatchResult matchResultH = j.f154703f.h(str, 0);
            if (matchResultH == null) {
                throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
            }
            String str2 = matchResultH.b().get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            String lowerCase2 = matchResultH.b().get(2).toLowerCase(locale);
            Intrinsics.i(lowerCase2, "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            int iH = matchResultH.c().getLast();
            while (true) {
                int i10 = iH + 1;
                if (i10 >= str.length()) {
                    return new j(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                MatchResult matchResultH2 = j.f154704g.h(str, i10);
                if (matchResultH2 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(i10);
                    Intrinsics.i(strSubstring, "substring(...)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                MatchGroup matchGroup = matchResultH2.getGroups().get(1);
                String strB = matchGroup != null ? matchGroup.getValue() : null;
                if (strB == null) {
                    iH = matchResultH2.c().getLast();
                } else {
                    MatchGroup matchGroup2 = matchResultH2.getGroups().get(2);
                    String strB2 = matchGroup2 != null ? matchGroup2.getValue() : null;
                    if (strB2 == null) {
                        MatchGroup matchGroup3 = matchResultH2.getGroups().get(3);
                        Intrinsics.g(matchGroup3);
                        strB2 = matchGroup3.getValue();
                    } else if (StringsKt.h1(strB2, '\'', false, 2, null) && StringsKt.g0(strB2, '\'', false, 2, null) && strB2.length() > 2) {
                        strB2 = strB2.substring(1, strB2.length() - 1);
                        Intrinsics.i(strB2, "substring(...)");
                    }
                    arrayList.add(strB);
                    arrayList.add(strB2);
                    iH = matchResultH2.c().getLast();
                }
            }
        }

        @JvmStatic
        @JvmName
        public final j b(String str) {
            Intrinsics.j(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    @JvmStatic
    @JvmName
    public static final j e(String str) {
        return INSTANCE.a(str);
    }

    @JvmStatic
    @JvmName
    public static final j g(String str) {
        return INSTANCE.b(str);
    }

    public j(String mediaType, String type, String subtype, String[] parameterNamesAndValues) {
        Intrinsics.j(mediaType, "mediaType");
        Intrinsics.j(type, "type");
        Intrinsics.j(subtype, "subtype");
        Intrinsics.j(parameterNamesAndValues, "parameterNamesAndValues");
        this.mediaType = mediaType;
        this.type = type;
        this.subtype = subtype;
        this.parameterNamesAndValues = parameterNamesAndValues;
    }

    public static /* synthetic */ Charset d(j jVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return jVar.c(charset);
    }

    @JvmOverloads
    public final Charset c(Charset defaultValue) {
        String strF = f("charset");
        if (strF == null) {
            return defaultValue;
        }
        try {
            return Charset.forName(strF);
        } catch (IllegalArgumentException unused) {
            return defaultValue;
        }
    }

    public boolean equals(Object other) {
        return (other instanceof j) && Intrinsics.e(((j) other).mediaType, this.mediaType);
    }

    public final String f(String name) {
        Intrinsics.j(name, "name");
        int i10 = 0;
        int iC = ProgressionUtilKt.c(0, this.parameterNamesAndValues.length - 1, 2);
        if (iC < 0) {
            return null;
        }
        while (!StringsKt.H(this.parameterNamesAndValues[i10], name, true)) {
            if (i10 == iC) {
                return null;
            }
            i10 += 2;
        }
        return this.parameterNamesAndValues[i10 + 1];
    }

    @JvmName
    /* renamed from: h, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    @JvmName
    /* renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: toString, reason: from getter */
    public String getMediaType() {
        return this.mediaType;
    }
}
