package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage;

/* renamed from: com.google.android.gms.internal.ads.mt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final /* synthetic */ class C8919mt {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f77754a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f77754a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f77754a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f77754a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f77754a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f77754a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
