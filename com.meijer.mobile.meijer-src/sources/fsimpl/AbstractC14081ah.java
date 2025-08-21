package fsimpl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: fsimpl.ah, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC14081ah {

    /* renamed from: a, reason: collision with root package name */
    private final int f132830a;

    /* renamed from: b, reason: collision with root package name */
    private int f132831b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Map f132832c = new HashMap(10, 0.75f);

    public AbstractC14081ah(int i10) {
        this.f132830a = i10;
    }

    public int a(long j10) {
        Integer num;
        if (this.f132831b == 0 || (num = (Integer) this.f132832c.get(Long.valueOf(j10))) == null) {
            return 0;
        }
        return num.intValue();
    }

    public void a() {
        int i10 = this.f132831b + 1;
        this.f132831b = i10;
        if (i10 >= this.f132830a) {
            this.f132831b = 0;
        }
    }

    public void a(long j10, int i10) {
        this.f132832c.put(Long.valueOf(j10), Integer.valueOf(i10));
    }

    public void a(boolean z10) {
        if (z10) {
            this.f132832c.clear();
            this.f132831b = 0;
        }
    }
}
