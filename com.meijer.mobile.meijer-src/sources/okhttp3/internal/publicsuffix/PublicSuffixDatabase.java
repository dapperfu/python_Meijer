package okhttp3.internal.publicsuffix;

import Nv.h;
import com.medallia.digital.mobilesdk.l3;
import gw.C14419h;
import java.net.IDN;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "Lokhttp3/internal/publicsuffix/a;", "publicSuffixList", "<init>", "(Lokhttp3/internal/publicsuffix/a;)V", "", "domain", "", "d", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "b", "(Ljava/util/List;)Ljava/util/List;", "c", "(Ljava/lang/String;)Ljava/lang/String;", "a", "Lokhttp3/internal/publicsuffix/a;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PublicSuffixDatabase {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final C14419h f154696c = C14419h.INSTANCE.e(42);

    /* renamed from: d, reason: collision with root package name */
    private static final List<String> f154697d = CollectionsKt.e("*");

    /* renamed from: e, reason: collision with root package name */
    private static final PublicSuffixDatabase f154698e = new PublicSuffixDatabase(b.a(a.INSTANCE));

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a publicSuffixList;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;", "", "<init>", "()V", "Lgw/h;", "", "labels", "", "labelIndex", "", "b", "(Lgw/h;[Lgw/h;I)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "c", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "WILDCARD_LABEL", "Lgw/h;", "", "PREVAILING_RULE", "Ljava/util/List;", "", "EXCEPTION_MARKER", "C", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(C14419h c14419h, C14419h[] c14419hArr, int i10) {
            int i11;
            int iB;
            boolean z10;
            int iB2;
            int iV = c14419h.V();
            int i12 = 0;
            while (i12 < iV) {
                int i13 = (i12 + iV) / 2;
                while (i13 > -1 && c14419h.u(i13) != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (c14419h.u(i11) == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iB = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        iB = h.b(c14419hArr[i17].u(i18), l3.f93323c);
                        z10 = z12;
                    }
                    iB2 = iB - h.b(c14419h.u(i14 + i19), l3.f93323c);
                    if (iB2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (c14419hArr[i17].V() != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == c14419hArr.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (iB2 >= 0) {
                    if (iB2 <= 0) {
                        int i20 = i16 - i19;
                        int iV2 = c14419hArr[i17].V() - i18;
                        int length = c14419hArr.length;
                        for (int i21 = i17 + 1; i21 < length; i21++) {
                            iV2 += c14419hArr[i21].V();
                        }
                        if (iV2 >= i20) {
                            if (iV2 <= i20) {
                                return c14419h.Y(i14, i16 + i14).X(Charsets.UTF_8);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                iV = i13;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f154698e;
        }
    }

    private final List<String> d(String domain) {
        List<String> listA1 = StringsKt.a1(domain, new char[]{'.'}, false, 0, 6, null);
        return Intrinsics.e(CollectionsKt.D0(listA1), "") ? CollectionsKt.k0(listA1, 1) : listA1;
    }

    public PublicSuffixDatabase(a publicSuffixList) {
        Intrinsics.j(publicSuffixList, "publicSuffixList");
        this.publicSuffixList = publicSuffixList;
    }

    private final List<String> b(List<String> domainLabels) {
        String str;
        String strB;
        String str2;
        List<String> listM;
        List<String> listM2;
        this.publicSuffixList.b();
        int size = domainLabels.size();
        C14419h[] c14419hArr = new C14419h[size];
        for (int i10 = 0; i10 < size; i10++) {
            c14419hArr[i10] = C14419h.INSTANCE.d(domainLabels.get(i10));
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                strB = null;
                break;
            }
            strB = INSTANCE.b(this.publicSuffixList.a(), c14419hArr, i11);
            if (strB != null) {
                break;
            }
            i11++;
        }
        if (size > 1) {
            C14419h[] c14419hArr2 = (C14419h[]) c14419hArr.clone();
            int length = c14419hArr2.length - 1;
            for (int i12 = 0; i12 < length; i12++) {
                c14419hArr2[i12] = f154696c;
                String strB2 = INSTANCE.b(this.publicSuffixList.a(), c14419hArr2, i12);
                if (strB2 != null) {
                    str2 = strB2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i13 = size - 1;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    break;
                }
                String strB3 = INSTANCE.b(this.publicSuffixList.c(), c14419hArr, i14);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
                i14++;
            }
        }
        if (str != null) {
            return StringsKt.a1('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strB == null && str2 == null) {
            return f154697d;
        }
        if (strB == null || (listM = StringsKt.a1(strB, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM = CollectionsKt.m();
        }
        if (str2 == null || (listM2 = StringsKt.a1(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM2 = CollectionsKt.m();
        }
        return listM.size() > listM2.size() ? listM : listM2;
    }

    public final String c(String domain) {
        int size;
        int size2;
        Intrinsics.j(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        Intrinsics.g(unicode);
        List<String> listD = d(unicode);
        List<String> listB = b(listD);
        if (listD.size() == listB.size() && listB.get(0).charAt(0) != '!') {
            return null;
        }
        if (listB.get(0).charAt(0) == '!') {
            size = listD.size();
            size2 = listB.size();
        } else {
            size = listD.size();
            size2 = listB.size() + 1;
        }
        return SequencesKt.K(SequencesKt.A(CollectionsKt.f0(d(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
