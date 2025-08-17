package L3;

import Ce.L;
import a3.x;
import com.medallia.digital.mobilesdk.q2;
import d3.C13466a;
import d3.P;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class n extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17866b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final String f17867c;

    /* renamed from: d, reason: collision with root package name */
    public final L<String> f17868d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f17854a, nVar.f17854a) && Objects.equals(this.f17866b, nVar.f17866b) && this.f17868d.equals(nVar.f17868d)) {
                return true;
            }
        }
        return false;
    }

    private static List<Integer> d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // a3.y.a
    public void b(x.b bVar) throws NumberFormatException {
        String str = this.f17854a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 22;
                    break;
                }
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    bVar.P(this.f17868d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.U(this.f17868d.get(0));
                    break;
                case 2:
                case '\r':
                    String str2 = this.f17868d.get(0);
                    bVar.h0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).g0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    bVar.Q(this.f17868d.get(0));
                    break;
                case 4:
                case 19:
                    bVar.O(this.f17868d.get(0));
                    break;
                case 5:
                case 20:
                    bVar.V(this.f17868d.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrC1 = P.c1(this.f17868d.get(0), q2.f92724c);
                    bVar.s0(Integer.valueOf(Integer.parseInt(strArrC1[0]))).r0(strArrC1.length > 1 ? Integer.valueOf(Integer.parseInt(strArrC1[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.p0(this.f17868d.get(0));
                    break;
                case '\b':
                case 16:
                    bVar.t0(this.f17868d.get(0));
                    break;
                case '\t':
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    bVar.i0(Integer.valueOf(Integer.parseInt(this.f17868d.get(0))));
                    break;
                case '\f':
                    Integer numM = He.f.m(this.f17868d.get(0));
                    if (numM != null) {
                        String strA = j.a(numM.intValue());
                        if (strA != null) {
                            bVar.c0(strA);
                            break;
                        }
                    } else {
                        bVar.c0(this.f17868d.get(0));
                        break;
                    }
                    break;
                case 14:
                    List<Integer> listD = d(this.f17868d.get(0));
                    int size = listD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.g0(listD.get(2));
                            }
                        }
                        bVar.h0(listD.get(1));
                    }
                    bVar.i0(listD.get(0));
                    break;
                case 15:
                    List<Integer> listD2 = d(this.f17868d.get(0));
                    int size2 = listD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.j0(listD2.get(2));
                            }
                        }
                        bVar.k0(listD2.get(1));
                    }
                    bVar.l0(listD2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public int hashCode() {
        int iHashCode = (527 + this.f17854a.hashCode()) * 31;
        String str = this.f17866b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f17868d.hashCode();
    }

    @Override // L3.i
    public String toString() {
        return this.f17854a + ": description=" + this.f17866b + ": values=" + this.f17868d;
    }

    public n(String str, String str2, List<String> list) {
        super(str);
        C13466a.a(!list.isEmpty());
        this.f17866b = str2;
        L<String> lS = L.s(list);
        this.f17868d = lS;
        this.f17867c = lS.get(0);
    }
}
