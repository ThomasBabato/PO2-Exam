package Exam_180904;

// 3B

public interface Either<T> {

    T onSuccess(T t);

    void onFailure(T t) throws Exception;

}
