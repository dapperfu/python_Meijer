package um;

import vm.C17693b;

/* renamed from: um.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC17446a extends androidx.databinding.a {

    /* renamed from: a, reason: collision with root package name */
    protected C17693b f164282a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC2605a f164283b = EnumC2605a.NEEDS_REFRESH;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC17448c f164284c;

    /* renamed from: um.a$a, reason: collision with other inner class name */
    public enum EnumC2605a {
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
        this.f164284c = null;
    }

    public abstract void S();

    protected InterfaceC17448c M() {
        return this.f164284c;
    }

    protected boolean N() {
        return this.f164284c != null;
    }

    public void O(InterfaceC17448c interfaceC17448c) {
        this.f164284c = interfaceC17448c;
    }

    protected boolean T() {
        if (this.f164283b.b()) {
            return true;
        }
        C17693b c17693b = this.f164282a;
        return c17693b != null && c17693b.e() && this.f164283b == EnumC2605a.IDLE;
    }

    public AbstractC17446a(C17693b c17693b) {
        this.f164282a = c17693b;
    }

    public void Q() {
        if (T()) {
            S();
        }
    }
}
