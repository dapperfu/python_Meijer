package tm;

import um.C17279b;

/* renamed from: tm.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC17122a extends androidx.databinding.a {

    /* renamed from: a, reason: collision with root package name */
    protected C17279b f161920a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC2540a f161921b = EnumC2540a.NEEDS_REFRESH;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC17124c f161922c;

    /* renamed from: tm.a$a, reason: collision with other inner class name */
    public enum EnumC2540a {
        NEEDS_REFRESH,
        IDLE,
        REFRESHING_DATA,
        SAVING_DATA,
        FINISH_ACTIVITY;

        public boolean b() {
            return this == NEEDS_REFRESH;
        }
    }

    public void P() {
        this.f161922c = null;
    }

    public abstract void S();

    protected InterfaceC17124c M() {
        return this.f161922c;
    }

    protected boolean N() {
        return this.f161922c != null;
    }

    public void O(InterfaceC17124c interfaceC17124c) {
        this.f161922c = interfaceC17124c;
    }

    protected boolean T() {
        if (this.f161921b.b()) {
            return true;
        }
        C17279b c17279b = this.f161920a;
        return c17279b != null && c17279b.e() && this.f161921b == EnumC2540a.IDLE;
    }

    public AbstractC17122a(C17279b c17279b) {
        this.f161920a = c17279b;
    }

    public void Q() {
        if (T()) {
            S();
        }
    }
}
