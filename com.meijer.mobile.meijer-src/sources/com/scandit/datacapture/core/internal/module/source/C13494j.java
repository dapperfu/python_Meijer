package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13494j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f126039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13498n f126040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeCameraDelegateSettings f126041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f126042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13494j(boolean z10, C13498n c13498n, NativeCameraDelegateSettings nativeCameraDelegateSettings, NativeWrappedPromise nativeWrappedPromise) {
        super(0);
        this.f126039a = z10;
        this.f126040b = c13498n;
        this.f126041c = nativeCameraDelegateSettings;
        this.f126042d = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f126039a) {
            this.f126040b.f126058j = new WeakReference(this.f126041c);
            this.f126040b.a(new C13493i(this.f126042d));
        } else {
            this.f126042d.setError();
        }
        return Unit.f143329a;
    }
}
