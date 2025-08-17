package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13361j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f125087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13365n f125088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeCameraDelegateSettings f125089c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f125090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13361j(boolean z10, C13365n c13365n, NativeCameraDelegateSettings nativeCameraDelegateSettings, NativeWrappedPromise nativeWrappedPromise) {
        super(0);
        this.f125087a = z10;
        this.f125088b = c13365n;
        this.f125089c = nativeCameraDelegateSettings;
        this.f125090d = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f125087a) {
            this.f125088b.f125106j = new WeakReference(this.f125089c);
            this.f125088b.a(new C13360i(this.f125090d));
        } else {
            this.f125090d.setError();
        }
        return Unit.f142422a;
    }
}
