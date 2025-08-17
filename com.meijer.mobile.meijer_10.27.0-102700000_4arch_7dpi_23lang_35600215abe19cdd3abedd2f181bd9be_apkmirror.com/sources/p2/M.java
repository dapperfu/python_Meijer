package p2;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* loaded from: classes.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    private final d f155343a;

    private static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final ScrollFeedbackProvider f155344a;

        @Override // p2.M.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
            this.f155344a.onScrollLimit(i10, i11, i12, z10);
        }

        @Override // p2.M.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
            this.f155344a.onScrollProgress(i10, i11, i12, i13);
        }

        b(View view) {
            this.f155344a = ScrollFeedbackProvider.createProvider(view);
        }
    }

    private static class c implements d {
        private c() {
        }

        @Override // p2.M.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        }

        @Override // p2.M.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
        }
    }

    private interface d {
        void onScrollLimit(int i10, int i11, int i12, boolean z10);

        void onScrollProgress(int i10, int i11, int i12, int i13);
    }

    public static M a(View view) {
        return new M(view);
    }

    public void b(int i10, int i11, int i12, boolean z10) {
        this.f155343a.onScrollLimit(i10, i11, i12, z10);
    }

    public void c(int i10, int i11, int i12, int i13) {
        this.f155343a.onScrollProgress(i10, i11, i12, i13);
    }

    private M(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f155343a = new b(view);
        } else {
            this.f155343a = new c();
        }
    }
}
