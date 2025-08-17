package fsimpl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: fsimpl.ah, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC13956ah {

    /* renamed from: a, reason: collision with root package name */
    private final int f131580a;

    /* renamed from: b, reason: collision with root package name */
    private int f131581b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Map f131582c = new HashMap(10, 0.75f);

    public AbstractC13956ah(int i10) {
        this.f131580a = i10;
    }

    public int a(long j10) {
        Integer num;
        if (this.f131581b == 0 || (num = (Integer) this.f131582c.get(Long.valueOf(j10))) == null) {
            return 0;
        }
        return num.intValue();
    }

    public void a() {
        int i10 = this.f131581b + 1;
        this.f131581b = i10;
        if (i10 >= this.f131580a) {
            this.f131581b = 0;
        }
    }

    public void a(long j10, int i10) {
        this.f131582c.put(Long.valueOf(j10), Integer.valueOf(i10));
    }

    public void a(boolean z10) {
        if (z10) {
            this.f131582c.clear();
            this.f131581b = 0;
        }
    }
}
