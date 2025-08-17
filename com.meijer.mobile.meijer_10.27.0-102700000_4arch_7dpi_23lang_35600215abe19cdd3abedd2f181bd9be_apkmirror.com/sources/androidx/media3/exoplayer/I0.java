package androidx.media3.exoplayer;

import android.annotation.SuppressLint;

/* loaded from: classes.dex */
public interface I0 {

    public interface a {
        void a(H0 h02);
    }

    @SuppressLint({"WrongConstant"})
    static int D(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    @SuppressLint({"WrongConstant"})
    static int F(int i10) {
        return i10 & 64;
    }

    @SuppressLint({"WrongConstant"})
    static int Q(int i10) {
        return i10 & 7;
    }

    @SuppressLint({"WrongConstant"})
    static int n(int i10) {
        return i10 & 384;
    }

    static int r(int i10, int i11, int i12, int i13, int i14) {
        return D(i10, i11, i12, i13, i14, 0);
    }

    static int s(int i10, int i11, int i12, int i13) {
        return D(i10, i11, i12, 0, 128, i13);
    }

    @SuppressLint({"WrongConstant"})
    static int t(int i10) {
        return i10 & 32;
    }

    @SuppressLint({"WrongConstant"})
    static int u(int i10) {
        return i10 & 24;
    }

    static int v(int i10) {
        return s(i10, 0, 0, 0);
    }

    @SuppressLint({"WrongConstant"})
    static int z(int i10) {
        return i10 & 3584;
    }

    default void H(a aVar) {
    }

    int M() throws ExoPlaybackException;

    int a(a3.t tVar) throws ExoPlaybackException;

    int g();

    String getName();

    default void j() {
    }

    static boolean p(int i10, boolean z10) {
        int iQ = Q(i10);
        if (iQ != 4) {
            if (!z10 || iQ != 3) {
                return false;
            }
            return true;
        }
        return true;
    }
}
