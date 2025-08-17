package xu;

import V2.CreationExtras;
import androidx.view.C5996L;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private CreationExtras f169953a;

    /* renamed from: b, reason: collision with root package name */
    private C5996L f169954b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f169955c;

    public void a() {
        this.f169953a = null;
    }

    public boolean b() {
        return this.f169954b == null && this.f169953a == null;
    }

    public void c(CreationExtras creationExtras) {
        if (this.f169954b != null) {
            return;
        }
        this.f169953a = creationExtras;
    }

    h(CreationExtras creationExtras) {
        boolean z10;
        if (creationExtras == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f169955c = z10;
        this.f169953a = creationExtras;
    }
}
