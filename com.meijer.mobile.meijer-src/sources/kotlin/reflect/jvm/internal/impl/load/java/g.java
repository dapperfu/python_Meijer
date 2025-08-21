package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final Jsr305Settings f145286a;

    public g(Jsr305Settings jsr305Settings) {
        this.f145286a = jsr305Settings;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Jsr305Settings.b(this.f145286a);
    }
}
