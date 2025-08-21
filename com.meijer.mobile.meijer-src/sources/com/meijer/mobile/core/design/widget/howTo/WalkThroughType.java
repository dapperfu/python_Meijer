package com.meijer.mobile.core.design.widget.howTo;

import Cj.e;
import Cj.o;
import Vj.b;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes8.dex */
public enum WalkThroughType {
    SHOPPING_LIST(e.f4645e, e.f4643c, e.f4644d, o.f5100z, false, b.SHOPPING_LIST),
    MCARD(b.MCARD_REWARDS),
    MAIN_APP_FIRST_LAUNCH(b.APP_FIRST_LAUNCH, false, true);

    private final int descriptionsArrayResourceId;
    private final int finalButtonTextResourceId;
    private final int imagesArrayResourceId;
    private final boolean markSeenOnComplete;
    private final boolean required;
    private final int titlesArrayResourceId;
    private final b tutorialEnum;

    WalkThroughType(b bVar) {
        this(0, 0, 0, o.f5100z, true, bVar, false);
    }

    WalkThroughType(b bVar, int i10) {
        this(0, 0, 0, i10, true, bVar, false);
    }

    public int getDescriptionsArrayResourceId() {
        return this.descriptionsArrayResourceId;
    }

    public int getImagesArrayResourceId() {
        return this.imagesArrayResourceId;
    }

    public int getTitlesArrayResourceId() {
        return this.titlesArrayResourceId;
    }

    public b getTutorialEnum() {
        return this.tutorialEnum;
    }

    public boolean isRequired() {
        return this.required;
    }

    public boolean shouldMarkSeenOnComplete() {
        return this.markSeenOnComplete;
    }

    WalkThroughType(b bVar, boolean z10, boolean z11) {
        this(0, 0, 0, 0, z10, bVar, z11);
    }

    WalkThroughType(int i10, int i11, int i12, int i13, boolean z10, b bVar) {
        this(i10, i11, i12, i13, z10, bVar, true);
    }

    WalkThroughType(int i10, int i11, int i12, int i13, boolean z10, b bVar, boolean z11) {
        this.descriptionsArrayResourceId = i11;
        this.titlesArrayResourceId = i10;
        this.imagesArrayResourceId = i12;
        this.finalButtonTextResourceId = i13;
        this.required = z10;
        this.tutorialEnum = bVar;
        this.markSeenOnComplete = z11;
    }
}
