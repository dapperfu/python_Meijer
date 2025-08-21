package com.google.zxing;

/* loaded from: classes8.dex */
public final class ChecksumException extends ReaderException {

    /* renamed from: c, reason: collision with root package name */
    private static final ChecksumException f91601c;

    static {
        ChecksumException checksumException = new ChecksumException();
        f91601c = checksumException;
        checksumException.setStackTrace(ReaderException.f91605b);
    }

    public static ChecksumException a() {
        return ReaderException.f91604a ? new ChecksumException() : f91601c;
    }

    private ChecksumException() {
    }
}
