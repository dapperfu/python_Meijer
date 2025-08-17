package Vb;

import Vb.c;
import android.annotation.TargetApi;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import android.support.annotation.NonNull;
import cb.C6380a;
import cb.C6381b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

@TargetApi(21)
/* loaded from: classes4.dex */
public class u implements t {

    /* renamed from: e, reason: collision with root package name */
    private static final C6380a f37132e = C6381b.a(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Bb.b f37133a;

    /* renamed from: b, reason: collision with root package name */
    private tb.q f37134b;

    /* renamed from: c, reason: collision with root package name */
    private Lb.s f37135c;

    /* renamed from: d, reason: collision with root package name */
    private String f37136d;

    @Override // Vb.t
    @NonNull
    public final s a(boolean z10) {
        c[] cVarArrI = this.f37133a.e().I();
        if (cVarArrI == null) {
            r rVar = new r();
            c.a aVar = c.a.FULL_LENGTH;
            c cVar = new c();
            cVar.d("^XT1650.*");
            cVar.c(aVar);
            rVar.f37129a.add(cVar);
            c[] cVarArr = new c[rVar.f37129a.size()];
            rVar.f37129a.toArray(cVarArr);
            cVarArrI = cVarArr;
        }
        c cVarA = a(cVarArrI);
        ArrayList arrayList = new ArrayList();
        tb.q qVar = this.f37134b;
        qVar.f161606b.get();
        qVar.f161607c.get();
        boolean z11 = qVar.f161606b.get() || qVar.f161607c.get();
        if (a.f37137a[cVarA.a().ordinal()] != 1) {
            arrayList.add(b(140, 0));
            if (z11) {
                arrayList.add(b(76, 0));
            }
        } else {
            arrayList.add(b(140, 23));
            arrayList.add(b(140, 9));
            if (z11) {
                arrayList.add(b(76, 23));
            }
        }
        ScanSettings.Builder builder = new ScanSettings.Builder();
        builder.setScanMode(z10 ? Bb.b.b(this.f37133a.e().C(), 1) : Bb.b.b(this.f37133a.e().p(), 0));
        builder.setReportDelay(0L);
        if (this.f37135c.e()) {
            builder.setCallbackType(1);
            builder.setNumOfMatches(3);
            builder.setMatchMode(1);
        }
        return new s(arrayList, builder.build());
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37137a;

        static {
            int[] iArr = new int[c.a.values().length];
            f37137a = iArr;
            try {
                iArr[c.a.FULL_LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37137a[c.a.ANY_LENGTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static ScanFilter b(int i10, int i11) {
        ScanFilter.Builder builder = new ScanFilter.Builder();
        byte[] bArr = new byte[i11];
        Arrays.fill(bArr, (byte) 0);
        builder.setManufacturerData(i10, bArr, bArr);
        return builder.build();
    }

    public u(Bb.b bVar, tb.q qVar, String str, Lb.s sVar) {
        this.f37133a = bVar;
        this.f37134b = qVar;
        this.f37135c = sVar;
        this.f37136d = str == null ? Build.MODEL : str;
    }

    private c a(c[] cVarArr) {
        for (c cVar : cVarArr) {
            String strB = cVar.b();
            if (strB != null) {
                try {
                    if (Pattern.matches(strB, this.f37136d) && cVar.a() != null) {
                        return cVar;
                    }
                } catch (PatternSyntaxException unused) {
                    continue;
                }
            }
        }
        c cVar2 = new c();
        cVar2.c(c.a.ANY_LENGTH);
        cVar2.d(".*");
        return cVar2;
    }
}
