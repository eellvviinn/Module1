package com.skymate8.module1.four;

/**
 * Interface for shapes that can rotate
 */

public interface Rotate {
    //Methods
    /**
     * Rotates the shape by the specified number of degrees clockwise
     *
     * @param degrees the number of degrees to rotate the shape
     */
    void rotate(double degrees);
    /**
     * Rotates the shape 90 degrees clockwise
     */
    void rotate90();
    /**
     * Rotates the shape 180 degrees clockwise
     */
    void rotate180();

}
