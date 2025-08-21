package androidx.media3.ui;

/* loaded from: classes4.dex */
public interface D {

    public interface a {
        void B(D d10, long j10);

        void E(D d10, long j10);

        void G(D d10, long j10, boolean z10);
    }

    void a(a aVar);

    void b(long[] jArr, boolean[] zArr, int i10);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
