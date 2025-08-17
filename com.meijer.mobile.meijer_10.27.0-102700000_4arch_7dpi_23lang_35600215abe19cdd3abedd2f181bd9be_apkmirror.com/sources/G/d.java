package G;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d implements Comparator<Size> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11146a;

    public d() {
        this(false);
    }

    public d(boolean z10) {
        this.f11146a = z10;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Size size, Size size2) {
        int iSignum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        if (this.f11146a) {
            return iSignum * (-1);
        }
        return iSignum;
    }
}
