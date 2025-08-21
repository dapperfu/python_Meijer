package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class g extends NativeCameraFrameDataPool {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f126869a;

    public g(SequenceFrameSource owner) {
        Intrinsics.j(owner, "owner");
        this.f126869a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool
    public final void returnToPool(NativeCameraFrameData frameData) {
        Intrinsics.j(frameData, "frameData");
        SequenceFrameSource sequenceFrameSource = (SequenceFrameSource) this.f126869a.get();
        if (sequenceFrameSource != null) {
            SequenceFrameSource.access$returnToPool(sequenceFrameSource, frameData);
        }
    }
}
