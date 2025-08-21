package com.scandit.datacapture.barcode.generator;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;", "", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "LOW", "MEDIUM", "QUARTILE", "HIGH", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class QrCodeErrorCorrectionLevel {
    public static final QrCodeErrorCorrectionLevel HIGH;
    public static final QrCodeErrorCorrectionLevel LOW;
    public static final QrCodeErrorCorrectionLevel MEDIUM;
    public static final QrCodeErrorCorrectionLevel QUARTILE;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ QrCodeErrorCorrectionLevel[] f121986b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f121987c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String description;

    public static EnumEntries<QrCodeErrorCorrectionLevel> getEntries() {
        return f121987c;
    }

    public static QrCodeErrorCorrectionLevel valueOf(String str) {
        return (QrCodeErrorCorrectionLevel) Enum.valueOf(QrCodeErrorCorrectionLevel.class, str);
    }

    public static QrCodeErrorCorrectionLevel[] values() {
        return (QrCodeErrorCorrectionLevel[]) f121986b.clone();
    }

    static {
        QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel = new QrCodeErrorCorrectionLevel("LOW", 0, "Up to 7% damage");
        LOW = qrCodeErrorCorrectionLevel;
        QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel2 = new QrCodeErrorCorrectionLevel("MEDIUM", 1, "Up to 15% damage");
        MEDIUM = qrCodeErrorCorrectionLevel2;
        QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel3 = new QrCodeErrorCorrectionLevel("QUARTILE", 2, "Up to 25% damage");
        QUARTILE = qrCodeErrorCorrectionLevel3;
        QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel4 = new QrCodeErrorCorrectionLevel("HIGH", 3, "Up to 30% damage");
        HIGH = qrCodeErrorCorrectionLevel4;
        QrCodeErrorCorrectionLevel[] qrCodeErrorCorrectionLevelArr = {qrCodeErrorCorrectionLevel, qrCodeErrorCorrectionLevel2, qrCodeErrorCorrectionLevel3, qrCodeErrorCorrectionLevel4};
        f121986b = qrCodeErrorCorrectionLevelArr;
        f121987c = EnumEntriesKt.a(qrCodeErrorCorrectionLevelArr);
    }

    public final String getDescription() {
        return this.description;
    }

    private QrCodeErrorCorrectionLevel(String str, int i10, String str2) {
        this.description = str2;
    }
}
