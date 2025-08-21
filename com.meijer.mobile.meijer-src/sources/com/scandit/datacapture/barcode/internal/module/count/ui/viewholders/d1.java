package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.SharedPreferences;

/* loaded from: classes12.dex */
public final class d1 implements com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1 f122933a;

    public d1(h1 h1Var) {
        this.f122933a = h1Var;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b
    public final void a(boolean z10) {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorEdit = this.f122933a.f122965a.edit();
        if (editorEdit != null && (editorPutBoolean = editorEdit.putBoolean("barcode_count_toolbar_audio_feedback_key", z10)) != null) {
            editorPutBoolean.apply();
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b bVar = this.f122933a.f122966b;
        if (bVar != null) {
            bVar.a(z10);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b
    public final void b(boolean z10) {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorEdit = this.f122933a.f122965a.edit();
        if (editorEdit != null && (editorPutBoolean = editorEdit.putBoolean("barcode_count_toolbar_color_scheme_key", z10)) != null) {
            editorPutBoolean.apply();
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b bVar = this.f122933a.f122966b;
        if (bVar != null) {
            bVar.b(z10);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b
    public final void c(boolean z10) {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorEdit = this.f122933a.f122965a.edit();
        if (editorEdit != null && (editorPutBoolean = editorEdit.putBoolean("barcode_count_toolbar_strap_mode_key", z10)) != null) {
            editorPutBoolean.apply();
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b bVar = this.f122933a.f122966b;
        if (bVar != null) {
            bVar.c(z10);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b
    public final void d(boolean z10) {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorEdit = this.f122933a.f122965a.edit();
        if (editorEdit != null && (editorPutBoolean = editorEdit.putBoolean("barcode_count_toolbar_haptic_feedback_key", z10)) != null) {
            editorPutBoolean.apply();
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b bVar = this.f122933a.f122966b;
        if (bVar != null) {
            bVar.d(z10);
        }
    }
}
