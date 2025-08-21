package tu;

import V2.CreationExtras;
import androidx.view.C6138L;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private CreationExtras f163421a;

    /* renamed from: b, reason: collision with root package name */
    private C6138L f163422b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f163423c;

    public void a() {
        this.f163421a = null;
    }

    public boolean b() {
        return this.f163422b == null && this.f163421a == null;
    }

    public void c(CreationExtras creationExtras) {
        if (this.f163422b != null) {
            return;
        }
        this.f163421a = creationExtras;
    }

    h(CreationExtras creationExtras) {
        boolean z10;
        if (creationExtras == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f163423c = z10;
        this.f163421a = creationExtras;
    }
}
