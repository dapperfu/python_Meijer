package com.radiusnetworks.flybuy.sdk.sync;

import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.util.PreferenceExtensionKt;
import j$.time.Clock;
import j$.time.Instant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes12.dex */
public final class f extends Lambda implements Function2 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f121034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SyncWorker f121035g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Clock f121036h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Ref.BooleanRef booleanRef, SyncWorker syncWorker, Clock clock) {
        super(2);
        this.f121034f = booleanRef;
        this.f121035g = syncWorker;
        this.f121036h = clock;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SdkError sdkError = (SdkError) obj2;
        this.f121034f.f143735a = sdkError != null;
        PreferenceExtensionKt.setLastConfigSyncTime(this.f121035g.f121024h, Instant.now(this.f121036h).toEpochMilli());
        return Unit.f143329a;
    }
}
