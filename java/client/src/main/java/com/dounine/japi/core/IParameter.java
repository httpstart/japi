package com.dounine.japi.core;

import com.dounine.japi.serial.request.IRequest;
import com.dounine.japi.serial.request.RequestImpl;

import java.util.List;

/**
 * Created by lake on 17-2-10.
 */
public interface IParameter {

    List<IRequest> getRequestFields();

}
