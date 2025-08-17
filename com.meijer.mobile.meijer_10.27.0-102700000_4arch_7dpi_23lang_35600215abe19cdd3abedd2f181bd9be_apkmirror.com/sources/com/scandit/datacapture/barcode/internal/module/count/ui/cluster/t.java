package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import com.scandit.datacapture.core.data.ClusteringMode;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121573a;

    static {
        int[] iArr = new int[ClusteringMode.values().length];
        try {
            iArr[ClusteringMode.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClusteringMode.AUTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClusteringMode.MANUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ClusteringMode.AUTO_WITH_MANUAL_CORRECTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f121573a = iArr;
    }
}
