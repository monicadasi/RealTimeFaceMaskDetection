package com.arts.realtime_facemask_detection.customview;

import com.arts.realtime_facemask_detection.tflite.Classifier.Recognition;

import java.util.List;

public interface ResultsView {
    public void setResults(final List<Recognition> results);
}
