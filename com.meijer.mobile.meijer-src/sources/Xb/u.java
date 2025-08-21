package Xb;

import Xb.c;
import android.annotation.TargetApi;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import android.support.annotation.NonNull;
import eb.C13784a;
import eb.C13785b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

@TargetApi(21)
/* loaded from: classes4.dex */
public class u implements t {

    /* renamed from: e, reason: collision with root package name */
    private static final C13784a f41844e = C13785b.a(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Db.b f41845a;

    /* renamed from: b, reason: collision with root package name */
    private vb.q f41846b;

    /* renamed from: c, reason: collision with root package name */
    private Nb.s f41847c;

    /* renamed from: d, reason: collision with root package name */
    private String f41848d;

    @Override // Xb.t
    @NonNull
    public final s a(boolean z10) {
        c[] cVarArrI = this.f41845a.e().I();
        if (cVarArrI == null) {
            r rVar = new r();
            c.a aVar = c.a.FULL_LENGTH;
            c cVar = new c();
            cVar.d("^XT1650.*");
            cVar.c(aVar);
            rVar.f41841a.add(cVar);
            c[] cVarArr = new c[rVar.f41841a.size()];
            rVar.f41841a.toArray(cVarArr);
            cVarArrI = cVarArr;
        }
        c cVarA = a(cVarArrI);
        ArrayList arrayList = new ArrayList();
        vb.q qVar = this.f41846b;
        qVar.f165784b.get();
        qVar.f165785c.get();
        boolean z11 = qVar.f165784b.get() || qVar.f165785c.get();
        if (a.f41849a[cVarA.a().ordinal()] != 1) {
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
        builder.setScanMode(z10 ? Db.b.b(this.f41845a.e().C(), 1) : Db.b.b(this.f41845a.e().p(), 0));
        builder.setReportDelay(0L);
        if (this.f41847c.e()) {
            builder.setCallbackType(1);
            builder.setNumOfMatches(3);
            builder.setMatchMode(1);
        }
        return new s(arrayList, builder.build());
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41849a;

        static {
            int[] iArr = new int[c.a.values().length];
            f41849a = iArr;
            try {
                iArr[c.a.FULL_LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41849a[c.a.ANY_LENGTH.ordinal()] = 2;
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

    public u(Db.b bVar, vb.q qVar, String str, Nb.s sVar) {
        this.f41845a = bVar;
        this.f41846b = qVar;
        this.f41847c = sVar;
        this.f41848d = str == null ? Build.MODEL : str;
    }

    private c a(c[] cVarArr) {
        for (c cVar : cVarArr) {
            String strB = cVar.b();
            if (strB != null) {
                try {
                    if (Pattern.matches(strB, this.f41848d) && cVar.a() != null) {
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
