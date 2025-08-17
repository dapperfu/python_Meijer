package com.google.zxing;

/* loaded from: classes7.dex */
public final class ChecksumException extends ReaderException {

    /* renamed from: c, reason: collision with root package name */
    private static final ChecksumException f90762c;

    static {
        ChecksumException checksumException = new ChecksumException();
        f90762c = checksumException;
        checksumException.setStackTrace(ReaderException.f90766b);
    }

    public static ChecksumException a() {
        return ReaderException.f90765a ? new ChecksumException() : f90762c;
    }

    private ChecksumException() {
    }
}
