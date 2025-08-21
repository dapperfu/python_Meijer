package j0;

import com.google.android.gms.common.api.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ+\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lj0/w;", "", "<init>", "()V", "", "Landroidx/compose/ui/layout/r;", "measurables", "", "availableHeight", "mainAxisSpacing", "d", "(Ljava/util/List;II)I", "h", "availableWidth", "c", "g", "b", "f", "a", "e", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14919w {

    /* renamed from: a, reason: collision with root package name */
    public static final C14919w f139748a = new C14919w();

    private C14919w() {
    }

    public final int a(List<? extends androidx.compose.ui.layout.r> measurables, int availableWidth, int mainAxisSpacing) {
        int iRound;
        int iRound2;
        int i10;
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        List<? extends androidx.compose.ui.layout.r> list = measurables;
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.r rVar = measurables.get(i11);
            float fE = C14884E.e(C14884E.c(rVar));
            if (fE == 0.0f) {
                if (availableWidth == Integer.MAX_VALUE) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = availableWidth - iMin;
                }
                int iMin2 = Math.min(rVar.j0(a.e.API_PRIORITY_OTHER), i10);
                iMin += iMin2;
                iMax = Math.max(iMax, rVar.A(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        if (f10 == 0.0f) {
            iRound = 0;
        } else if (availableWidth == Integer.MAX_VALUE) {
            iRound = Integer.MAX_VALUE;
        } else {
            iRound = Math.round(Math.max(availableWidth - iMin, 0) / f10);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            androidx.compose.ui.layout.r rVar2 = measurables.get(i12);
            float fE2 = C14884E.e(C14884E.c(rVar2));
            if (fE2 > 0.0f) {
                if (iRound != Integer.MAX_VALUE) {
                    iRound2 = Math.round(iRound * fE2);
                } else {
                    iRound2 = Integer.MAX_VALUE;
                }
                iMax = Math.max(iMax, rVar2.A(iRound2));
            }
        }
        return iMax;
    }

    public final int b(List<? extends androidx.compose.ui.layout.r> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i10 = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.r rVar = measurables.get(i11);
            float fE = C14884E.e(C14884E.c(rVar));
            int iJ0 = rVar.j0(availableHeight);
            if (fE == 0.0f) {
                i10 += iJ0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iJ0 / fE));
            }
        }
        return Math.round(iMax * f10) + i10 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int c(List<? extends androidx.compose.ui.layout.r> measurables, int availableWidth, int mainAxisSpacing) {
        int iRound;
        int iRound2;
        int i10;
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        List<? extends androidx.compose.ui.layout.r> list = measurables;
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.r rVar = measurables.get(i11);
            float fE = C14884E.e(C14884E.c(rVar));
            if (fE == 0.0f) {
                if (availableWidth == Integer.MAX_VALUE) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = availableWidth - iMin;
                }
                int iMin2 = Math.min(rVar.j0(a.e.API_PRIORITY_OTHER), i10);
                iMin += iMin2;
                iMax = Math.max(iMax, rVar.W(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        if (f10 == 0.0f) {
            iRound = 0;
        } else if (availableWidth == Integer.MAX_VALUE) {
            iRound = Integer.MAX_VALUE;
        } else {
            iRound = Math.round(Math.max(availableWidth - iMin, 0) / f10);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            androidx.compose.ui.layout.r rVar2 = measurables.get(i12);
            float fE2 = C14884E.e(C14884E.c(rVar2));
            if (fE2 > 0.0f) {
                if (iRound != Integer.MAX_VALUE) {
                    iRound2 = Math.round(iRound * fE2);
                } else {
                    iRound2 = Integer.MAX_VALUE;
                }
                iMax = Math.max(iMax, rVar2.W(iRound2));
            }
        }
        return iMax;
    }

    public final int d(List<? extends androidx.compose.ui.layout.r> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i10 = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.r rVar = measurables.get(i11);
            float fE = C14884E.e(C14884E.c(rVar));
            int iD0 = rVar.d0(availableHeight);
            if (fE == 0.0f) {
                i10 += iD0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iD0 / fE));
            }
        }
        return Math.round(iMax * f10) + i10 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int e(List<? extends androidx.compose.ui.layout.r> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i10 = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.r rVar = measurables.get(i11);
            float fE = C14884E.e(C14884E.c(rVar));
            int iA = rVar.A(availableWidth);
            if (fE == 0.0f) {
                i10 += iA;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iA / fE));
            }
        }
        return Math.round(iMax * f10) + i10 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int f(List<? extends androidx.compose.ui.layout.r> measurables, int availableHeight, int mainAxisSpacing) {
        int iRound;
        int iRound2;
        int i10;
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        List<? extends androidx.compose.ui.layout.r> list = measurables;
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.r rVar = measurables.get(i11);
            float fE = C14884E.e(C14884E.c(rVar));
            if (fE == 0.0f) {
                if (availableHeight == Integer.MAX_VALUE) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = availableHeight - iMin;
                }
                int iMin2 = Math.min(rVar.A(a.e.API_PRIORITY_OTHER), i10);
                iMin += iMin2;
                iMax = Math.max(iMax, rVar.j0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        if (f10 == 0.0f) {
            iRound = 0;
        } else if (availableHeight == Integer.MAX_VALUE) {
            iRound = Integer.MAX_VALUE;
        } else {
            iRound = Math.round(Math.max(availableHeight - iMin, 0) / f10);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            androidx.compose.ui.layout.r rVar2 = measurables.get(i12);
            float fE2 = C14884E.e(C14884E.c(rVar2));
            if (fE2 > 0.0f) {
                if (iRound != Integer.MAX_VALUE) {
                    iRound2 = Math.round(iRound * fE2);
                } else {
                    iRound2 = Integer.MAX_VALUE;
                }
                iMax = Math.max(iMax, rVar2.j0(iRound2));
            }
        }
        return iMax;
    }

    public final int g(List<? extends androidx.compose.ui.layout.r> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i10 = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.r rVar = measurables.get(i11);
            float fE = C14884E.e(C14884E.c(rVar));
            int iW = rVar.W(availableWidth);
            if (fE == 0.0f) {
                i10 += iW;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iW / fE));
            }
        }
        return Math.round(iMax * f10) + i10 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int h(List<? extends androidx.compose.ui.layout.r> measurables, int availableHeight, int mainAxisSpacing) {
        int iRound;
        int iRound2;
        int i10;
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        List<? extends androidx.compose.ui.layout.r> list = measurables;
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.r rVar = measurables.get(i11);
            float fE = C14884E.e(C14884E.c(rVar));
            if (fE == 0.0f) {
                if (availableHeight == Integer.MAX_VALUE) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = availableHeight - iMin;
                }
                int iMin2 = Math.min(rVar.A(a.e.API_PRIORITY_OTHER), i10);
                iMin += iMin2;
                iMax = Math.max(iMax, rVar.d0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        if (f10 == 0.0f) {
            iRound = 0;
        } else if (availableHeight == Integer.MAX_VALUE) {
            iRound = Integer.MAX_VALUE;
        } else {
            iRound = Math.round(Math.max(availableHeight - iMin, 0) / f10);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            androidx.compose.ui.layout.r rVar2 = measurables.get(i12);
            float fE2 = C14884E.e(C14884E.c(rVar2));
            if (fE2 > 0.0f) {
                if (iRound != Integer.MAX_VALUE) {
                    iRound2 = Math.round(iRound * fE2);
                } else {
                    iRound2 = Integer.MAX_VALUE;
                }
                iMax = Math.max(iMax, rVar2.d0(iRound2));
            }
        }
        return iMax;
    }
}
