package com.scandit.datacapture.core.ui.control;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.ui.control.LinearControlGroup;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes12.dex */
public final class h implements LinearControlGroup.Defaults {

    /* renamed from: a, reason: collision with root package name */
    public static final h f127027a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final LinearControlGroupOrientation f127028b = LinearControlGroupOrientation.VERTICAL;

    /* renamed from: c, reason: collision with root package name */
    public static final FloatWithUnit f127029c = new FloatWithUnit(16.0f, MeasureUnit.DIP);

    /* renamed from: d, reason: collision with root package name */
    public static final List f127030d = CollectionsKt.m();

    @Override // com.scandit.datacapture.core.ui.control.LinearControlGroup.Defaults
    public final List getControls() {
        return f127030d;
    }

    @Override // com.scandit.datacapture.core.ui.control.LinearControlGroup.Defaults
    public final LinearControlGroupOrientation getOrientation() {
        return f127028b;
    }

    @Override // com.scandit.datacapture.core.ui.control.LinearControlGroup.Defaults
    public final FloatWithUnit getSpacing() {
        return f127029c;
    }
}
